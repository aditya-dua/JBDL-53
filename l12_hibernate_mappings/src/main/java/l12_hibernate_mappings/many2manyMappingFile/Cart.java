package l12_hibernate_mappings.many2manyMappingFile;

import java.util.Set;

public class Cart {
	
	private int id;
	private int total;
	
	private Set<Item> items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public Cart(int id, int total, Set<Item> items) {
		super();
		this.id = id;
		this.total = total;
		this.items = items;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", total=" + total + ", items=" + items + "]";
	}
	
	

}
