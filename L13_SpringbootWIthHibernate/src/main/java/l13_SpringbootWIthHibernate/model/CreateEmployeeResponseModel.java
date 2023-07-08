package l13_SpringbootWIthHibernate.model;

public class CreateEmployeeResponseModel {

	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private int status;
	private String message;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public CreateEmployeeResponseModel(int id, String firstName, String lastName, String address, int status,
			String message) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.status = status;
		this.message = message;
	}
	public CreateEmployeeResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CreateEmployeeResponseModel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", status=" + status + ", message=" + message + "]";
	}
	
}
