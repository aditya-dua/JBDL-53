package l12_hibernate_mappings.many2many;

import java.util.Set;

public class Items {
	
	private int id;
	private String itemId;
	
	private Set<Cart> carts;
	
	
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
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

	public Set<Cart> getCarts() {
		return carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}

	public Items(int id, String itemId, Set<Cart> carts) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.carts = carts;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", itemId=" + itemId + ", carts=" + carts + "]";
	}
	
	
	
	
	
	

}
