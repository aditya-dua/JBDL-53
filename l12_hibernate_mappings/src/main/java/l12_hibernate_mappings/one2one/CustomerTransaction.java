package l12_hibernate_mappings.one2one;

public class CustomerTransaction {
	
	private int id;
	private double total;
	private Customer customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "CustomerTransaction [id=" + id + ", total=" + total + ", customer=" + customer + "]";
	}
	public CustomerTransaction(int id, double total, Customer customer) {
		super();
		this.id = id;
		this.total = total;
		this.customer = customer;
	}
	public CustomerTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
