package l12_hibernate_mappings.one2manyAnnotation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/*
 * cart_id integer not null, id integer not null, quantity integer, 
 * total integer, item_id varchar(255)
 */
@Entity
@Table(name="items-o2m-annotation")
public class Items {
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="item_id")
	private String itemId;
	
	@Column(name="total")
	private int total;
	
	@Column(name="quantity")
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="cart_id",nullable = false)
	private Cart cart;
	
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", itemId=" + itemId + ", total=" + total + ", quantity=" + quantity + ", cart="
				+ cart + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Items(int id, String itemId, int total, int quantity, Cart cart) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.total = total;
		this.quantity = quantity;
		this.cart = cart;
	}
	
	
	
	
	

}
