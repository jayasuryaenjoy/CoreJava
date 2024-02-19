import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListOfMap {

	public static void main(String[] args) {
		List<Map<String, String>> myList = new ArrayList<Map<String, String>>();

		Map<String, String> map = new HashMap<String, String>();
		map.put("hello", "value");
		map.put("hello2", "value2");
		map.put("hello3", "value3");
		map.put("hello4", "value4");

		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("hello5", "value5");
		map2.put("hello6", "value6");
		map2.put("hello7", "value7");
		map2.put("hello8", "value8");
		Map<String, String> map3 = new HashMap<String, String>();
		map2.put("hello5", "value5");
		map2.put("hello6", "value6");
		map2.put("hello7", "value7");
		map2.put("hello8", "value8");
		myList.add(map);
		myList.add(map2);
		myList.add(map3);
		Map<String, String> mymap = new HashMap<String, String>();
		System.out.print(myList.get(1));
		myList.get(0);

		for (int j = 0; j < myList.size(); j++) {

			Set<String> val1 = myList.get(j).keySet();
			Iterator<String> it = val1.iterator();
			while (it.hasNext()) {
				String next = it.next();
				String x = myList.get(j).get(next);
				mymap.put(next, x);
			}
		}

		String mystring = mymap.get("hello4");
		System.out.println(mystring);
	}

}
