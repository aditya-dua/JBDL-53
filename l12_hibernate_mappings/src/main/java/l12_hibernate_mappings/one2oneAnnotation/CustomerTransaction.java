package l12_hibernate_mappings.one2oneAnnotation;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="transaction-o2o-annotation")
public class CustomerTransaction {
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="total")
	private double total;
	
	@OneToOne(mappedBy = "transaction")
	@Cascade(value=CascadeType.SAVE_UPDATE)
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
