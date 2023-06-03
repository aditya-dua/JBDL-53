import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arList = new ArrayList<>();
		
		
		arList.add(1);
		arList.add(2);
		arList.add(3);
		arList.add(4);
		
		arList.remove(2);
		
		for(int i=0;i<arList.size();i++) {
			System.out.println(arList.get(i));
		}
		
		arList.remove(Integer.valueOf(4));
		
		for(int i=0;i<arList.size();i++) {
			System.out.println(arList.get(i));
		}
		
		for (Integer string : arList) {
			System.out.println(string);
		}
		
		System.out.println("The Size of array list id:"+arList.size());
		
		System.out.println(arList);
		
		List<String> strList = new ArrayList<>();
		
		strList.add("Aditya");
		strList.add("John");
		strList.add("David");
		strList.add("JAck");
		
		strList.remove("JAck");
		
		
		System.out.println(strList);

		for (String string : strList) {
			System.out.println(string);
		}
		
		Iterator iterator = strList.iterator();
		
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			if(str.equals("JAck")) {
				iterator.remove();
			}
			System.out.println(str);
		}
			
	}
}
