package l12_hibernate_mappings.many2many;

import java.util.Set;

public class Cart {
	
	private int id;
	private int total;
	private String name;
	
	private Set<Items> items;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Items> getItems() {
		return items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", total=" + total + ", name=" + name + ", items=" + items + "]";
	}

	public Cart(int id, int total, String name, Set<Items> items) {
		super();
		this.id = id;
		this.total = total;
		this.name = name;
		this.items = items;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
