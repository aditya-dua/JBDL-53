package multilevel;

public class Employee extends Person{
	
	int id;
	
	
	public Employee() {
		
	}
	
	public Employee(int id, String name,String gender) {
		super(name,gender);
		this.id=id;
		
	}
	
	public void display() {
		super.display();
		System.out.println("Display of Employee Called!");
	}

}
