package l7_springboot_curd_example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class CreateEmployeeResponse {

	private int id;
	private String name;
	private int sal;
	private String departmentName;
	public CreateEmployeeResponse(int id, String name, int sal, String departmentName) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.departmentName = departmentName;
	}
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
	public CreateEmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
