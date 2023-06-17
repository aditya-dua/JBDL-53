package org.gfg.jbdl53.l6_intro_to_sb.model;

public class PostEmployeeResponseModel {
	
	public int id;
	public String name;
	public int sal;
	public String dept;
	public int status;
	public String message;
	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "PostEmployeeResponseModel [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept
				+ ", status=" + status + ", message=" + message + "]";
	}
	public PostEmployeeResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PostEmployeeResponseModel(int id, String name, int sal, String dept, int status, String message) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
		this.status = status;
		this.message = message;
	}
	
	
	
	

}
