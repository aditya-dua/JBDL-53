package multilevel;

public class FullTimeEmployee extends Employee {
	
	int sal;
	
	public FullTimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public FullTimeEmployee(int id, String name,String gender, int sal) {
		// TODO Auto-generated constructor stub
		super(id,name,gender);
	
		this.sal=sal;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Display of FTE called");
		System.out.println("======================");
		System.out.println();
	}
	
	
	

}
