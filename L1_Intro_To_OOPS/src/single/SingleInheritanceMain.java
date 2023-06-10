package single;

public class SingleInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(1, "ABC");
		
		emp.display();
		
		FullTimeEmployee fte = new FullTimeEmployee();
		
		fte.display();
		
		//FullTimeEmployee fte2 = new Employee();

		
		Employee emp2 = new FullTimeEmployee();
		emp2.display();
		
		

	}
	
	
}
