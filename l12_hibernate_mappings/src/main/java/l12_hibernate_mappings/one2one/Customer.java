package l12_hibernate_mappings.one2one;

public class Customer {
	
	private int id;
	private String name;
	private String email;
	private String address;
	private CustomerTransaction transaction;
	
	
	public CustomerTransaction getTransaction() {
		return transaction;
	}
	public void setTransaction(CustomerTransaction transaction) {
		this.transaction = transaction;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", transaction="
				+ transaction + "]";
	}
	public Customer(int id, String name, String email, String address, CustomerTransaction transaction) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.transaction = transaction;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
