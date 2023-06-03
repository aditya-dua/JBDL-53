import java.util.ArrayList;
import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Purpose: It allows only unique values	
		HashSet<String> hs=new HashSet<>();
		
		hs.add("Aditya");
		hs.add("John");
		hs.add("David");
		hs.add("David");
		
		System.out.println("Output:"+hs.size());
		System.out.println(hs);
		
		hs.add("John");
		hs.add("Aditya2");
		hs.add("Aditya");
		System.out.println(hs);
		
		ArrayList<Integer> arList = new ArrayList<>();
		
		
		arList.add(1);
		arList.add(2);
		arList.add(1);
		arList.add(4);
		
		HashSet<Integer> hsInt=new HashSet<>(arList);
		System.out.println(hsInt);
		
	}

}
