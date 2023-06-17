package org.gfg.jbdl53.l6_intro_to_sb.model;

public class PostEmployeeRequestModel {

	public int id;
	public String name;
	public int sal;
	public String departmentName;
	
	
	public PostEmployeeRequestModel(int id, String name, int sal, String departmentName) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "PostEmployeeRequestModel [id=" + id + ", name=" + name + ", sal=" + sal + ", departmentName="
				+ departmentName + "]";
	}

	public PostEmployeeRequestModel() {
		super();
		// TODO Auto-generated constructor stub
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

	
	
	
	
	
	
}
