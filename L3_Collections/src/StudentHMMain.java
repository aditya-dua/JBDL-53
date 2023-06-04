import java.util.HashMap;

public class StudentHMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Student> stuHM=new HashMap<>();
		
		String names[]= {"Aditya","ROhan","John","David","Kartik"};
		Student stu;
		
		for(int i=0;i<5;i++) {
			
			stu=new Student(i+1,names[i]);
			
			stuHM.put(stu.id, stu);
		}
		
		/*for (Integer temp : stuHM.keySet()) {
			System.out.println("Id is:"+temp+" Student Object is"+stuHM.get(temp));;
		}*/
		
		
		HashMap<Student, Integer> percentHM=new HashMap<>();
		
		for(int i=0;i<5;i++) {
			
			stu=new Student(i+1,names[i]);
			
			percentHM.put(stu, i+20 );
		}
		
		for (Student temp : percentHM.keySet()) {
			System.out.println("Id is:"+temp+" Student Object is"+percentHM.get(temp));;
		}
	}

}
