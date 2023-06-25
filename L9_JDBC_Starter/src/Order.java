import java.util.Date;
import java.util.List;

public class Order {
	long id;
	Date orderDate;
	Date deliveryDate;
	String status;
	Customer customer;
	List<Product> products;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(long id, Date orderDate, Date deliveryDate, String status, Customer customer,
			List<Product> products) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.customer = customer;
		this.products = products;
	}
	
}
