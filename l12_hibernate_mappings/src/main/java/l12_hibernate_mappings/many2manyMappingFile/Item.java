package l12_hibernate_mappings.many2manyMappingFile;

import java.util.Set;

public class Item {

	private int id;
	private int price;
	private String description;
	
	private Set<Cart> carts;

	@Override
	public String toString() {
		return "Item [id=" + id + ", price=" + price + ", description=" + description + ", carts=" + carts + "]";
	}

	public Item(int id, int price, String description, Set<Cart> carts) {
		super();
		this.id = id;
		this.price = price;
		this.description = description;
		this.carts = carts;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Cart> getCarts() {
		return carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}
	
	
	
}
