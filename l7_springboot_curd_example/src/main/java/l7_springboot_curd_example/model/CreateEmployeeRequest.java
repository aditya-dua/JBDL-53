package l7_springboot_curd_example.model;

public class CreateEmployeeRequest {

	public int id;
	public String name;
	public int sal;
	public String departmentName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public CreateEmployeeRequest(int id, String name, int sal, String departmentName) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString() {
		return "CreateEmployeeRequest [id=" + id + ", name=" + name + ", sal=" + sal + ", departmentName="
				+ departmentName + "]";
	}
	
	public CreateEmployeeRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
