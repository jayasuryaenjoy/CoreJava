package restService;

public class StringError {

	public static void main(String[] args) {
		String str="{ \"data\": \"Quote Declined\" }";
		try {
			String jsonString = str.substring(1, str.length() - 1);
			String[] keyValue = jsonString.split(":");
			if (keyValue.length == 2) {
				String key = keyValue[0].trim();
				String value = keyValue[1].trim();

				if ("\"data\"".equals(key)) {
					String quoteStatus = value.substring(1, value.length() - 1);
					 System.out.println("Error while executing the Jarvis response " + quoteStatus);
					 throw new RuntimeException("Error while executing the Jarvis response" + quoteStatus);
					
				}
			}
		} catch (Exception e) {
			System.out.println(("Error parsing JSON response : " + e.getMessage()));
		}

	}

}
