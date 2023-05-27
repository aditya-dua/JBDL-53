package multilevel;

public class MultilevelInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		
		
		Employee emp = new Employee(1, "ABC","male");
		
		emp.display();
		
		FullTimeEmployee fte = new FullTimeEmployee();
		fte.display();
		
		//FullTimeEmployee fte2 = new Employee();

		
		Employee emp2 = new FullTimeEmployee();
		emp2.display();
		
		Person p1 = new FullTimeEmployee();
		
		

	}
	
	
}
