package restService;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JarvisError {

	public static void main(String[] args) {

		HttpURLConnection conn = null;
		BufferedReader reader;
		String line;
		StringBuilder responseContent = new StringBuilder();
		try {

			String jarvisUrl ="https://motorunderwriting.uat-hizuno.com/v1/fourwheeler";

			URL url = new URL(jarvisUrl);//

			conn = (HttpURLConnection) url.openConnection();

			String obj = null;
			conn.setRequestMethod("POST");
			conn.setConnectTimeout(15000);
			conn.setDoOutput(true);
			conn.setInstanceFollowRedirects(false);
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("charset", "utf-8");
			conn.setUseCaches(false);
			DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
			wr.write(obj.toString().getBytes("UTF-8"));
			wr.flush();

			// Test if the response from the server is successful
			int status = conn.getResponseCode();

			if (status != 200) {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
				while ((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();

				System.out.println("Get error from Jarvis" + responseContent.toString());

				try {
					String jsonString = responseContent.substring(1, responseContent.length() - 1);
					String[] keyValue = jsonString.split(":");
					if (keyValue.length == 2) {
						String key = keyValue[0].trim();
						String value = keyValue[1].trim();

						if ("\"data\"".equals(key)) {
							String quoteStatus = value.substring(1, value.length() - 1);
							throw new RuntimeException("Error while executing the Jarvis response" + quoteStatus);
						}
					}
				} catch (Exception e) {
					System.out.println("Error parsing JSON response : " + e.getMessage());
				}
			}

		}

		catch (Exception e) {
			System.out.println("Error while calling Jarvis:" + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error while executing the Jarvis response" + e.getMessage());

		} finally {
			conn.disconnect();
		}
	}
}
