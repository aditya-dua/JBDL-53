import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Aditya");
		ll.add("John");
		ll.add("David");
		
		System.out.println(ll);
		
		ll.add(0, "Element");
		System.out.println(ll);
		
		
		for (Iterator iterator = ll.descendingIterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
	}

}
