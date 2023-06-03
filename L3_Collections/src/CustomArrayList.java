import java.util.ArrayList;
import java.util.Iterator;

public class CustomArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> arrList = new ArrayList<>();
		
		Student stuTemp;
		for(int i =0;i<10;i++) {
			stuTemp = new Student(i+1, "Name "+i);
			
			arrList.add(stuTemp);
			
		}
		
		for (Iterator iterator = arrList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			
			// you add to get to get the total marks
			
		}
		
	}

}
