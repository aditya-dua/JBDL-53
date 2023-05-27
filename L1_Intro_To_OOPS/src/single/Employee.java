package single;

public class Employee {
	
	int id;
	String name;
	Address address;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Display of Employee Called!");
	}

}
