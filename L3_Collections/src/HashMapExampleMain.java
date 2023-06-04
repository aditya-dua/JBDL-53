import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Java");
		hm.put(2, "PHP");
		hm.put(3, ".Net");
		hm.put(4, "Node Js");
		hm.put(5, "Ruby");
		hm.put(6, "Python");
		
		
		/**
		 * Approach 2:
		 */
		
		for (Integer temp : hm.keySet()) {
		
			System.out.println("Key is:"+temp+" value :"+hm.get(temp));
		}
		
		for (String temp : hm.values()) {
			
			System.out.println("Value is:"+temp);
		}
		
		/**
		 * Approach 1:
		 */
		/*for (Map.Entry entry : hm.entrySet()) {
			Integer key = (Integer) entry.getKey();
			String val = (String) entry.getValue();
			
			System.out.println("Key is:"+key+" value is:"+val);
			
		}*/
		
		LinkedHashMap<String, String> newHM = new LinkedHashMap<>();

		newHM.put("1", "ABC");
		newHM.put("StudentName", "Test");
	}

}
