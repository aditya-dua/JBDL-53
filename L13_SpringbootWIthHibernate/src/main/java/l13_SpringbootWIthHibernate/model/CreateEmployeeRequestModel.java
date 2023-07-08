package l13_SpringbootWIthHibernate.model;

public class CreateEmployeeRequestModel {
	
	private String firstName;
	private String lastName;
	private String address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CreateEmployeeRequestModel(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "CreateEmployeeRequestModel [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}
	public CreateEmployeeRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
