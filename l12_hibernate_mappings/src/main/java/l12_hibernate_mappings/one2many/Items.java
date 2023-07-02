package l12_hibernate_mappings.one2many;

public class Items {
	
	private int id;
	private String itemId;
	private int total;
	private int quantity;
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
