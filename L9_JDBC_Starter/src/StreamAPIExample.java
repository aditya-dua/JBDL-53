import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StreamAPIExample {

	static List<Product> productList;
	static List<Customer> customerList;
	static List<Order> orderList;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadData();
	}
	/**
	 * Obtain a list of products belongs to category “Games” with price > 100
	 */
	public static void assignment1(){
		
	}
	
	/**
	 * Obtain a list of product with category = “Course” and then apply 10% discount
	 */
	public static void assignment2(){
		
	}
	
	/**
	 * Get the cheapest products of “Books” category
	 */
	public static void assignment3(){
		
	}
	
	/**
	 * Get the 3 most recent placed order
	 */
	public static void assignment4(){
		
	}	
	
	/**
	 * Get a list of orders which were ordered on a specific date, log the order records to the console and then return its product list
	 */
	public static void assignment5(){
		
	}
	
	/**
	 * Calculate total lump sum of all orders placed in May 2023
	 */
	public static void assignment6(){
		
	}
	
	/**
	 * Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”
	 */
	public static void assignment7(){
		
	}
	
	/**
	 * Obtain a data map with list of product name by category
	 */
	public static void assignment8(){
		
	}
	
	/**
	 * Get the most expensive product by category
	 */
	public static void assignment9(){
		
	}
	
	
	
	public static void loadData(){
		// TODO Auto-generated method stub
		try {
			productList = new ArrayList<>();
			customerList = new ArrayList<>();
			
			
			customerList.add(new Customer(1, "John Walker", 1));
			customerList.add(new Customer(2, "Marcus Tucker", 1));
			customerList.add(new Customer(3, "Sheldon Cooper", 1));
			customerList.add(new Customer(4, "Harry Potter", 2));
			customerList.add(new Customer(5, "Jack B. Daniel", 0));
			customerList.add(new Customer(6, "Dino Walter", 2));
			customerList.add(new Customer(7, "Sir Issac Newton", 1));
			customerList.add(new Customer(8, "Eroy Dickson", 2));
			customerList.add(new Customer(9, "Nick Donton", 1));
			customerList.add(new Customer(10, "Away Retuer", 1));
			
			productList.add(new Product(1, "Super Mario", "Games", 180));
			productList.add(new Product(2, "Pokemon", "Toys", 2));
			productList.add(new Product(3, "Wheat", "Grocery", 5));
			productList.add(new Product(4, "Java : A Definative Guide", "Books", 12));
			productList.add(new Product(5, "Java Backend Development Live", "Course", 50));
			productList.add(new Product(6, "Nintendo Switch", "Games", 250));
			productList.add(new Product(7, "Macbook Sleeve", "Tech", 20));
			productList.add(new Product(8, "Infinte Loop Tshirt", "Apparel", 100));
			productList.add(new Product(9, "MERN Stack Live", "Course", 45));
			productList.add(new Product(10, "Tzar", "Games", 25));
			productList.add(new Product(11, "Call Of Duty", "Games", 55));
			productList.add(new Product(12, "UNO Club Cards", "Toys", 24));
			productList.add(new Product(13, "Dancing Car", "Toys", 50));
			productList.add(new Product(14, "Lays Masala Magic", "Grocery", 2));
			productList.add(new Product(15, "Butter Salted", "Grocery", 1));
			
			List<Product> orderProductList = new ArrayList<>();
			orderProductList.add(new Product(1, "Super Mario", "Games", 180));
			orderProductList.add(new Product(2, "Pokemon", "Toys", 2));
			orderProductList.add(new Product(12, "UNO Club Cards", "Toys", 24));
			orderProductList.add(new Product(11, "Call Of Duty", "Games", 55));

			orderList.add(new Order(1, new Date("2023-02-28"), new Date("2023-03-08"), "DELIVERED", new Customer(2, "Marcus Tucker", 1),orderProductList) );

			
			orderProductList = new ArrayList<>();
			orderProductList.add(new Product(3, "Wheat", "Grocery", 5));
			orderProductList.add(new Product(7, "Macbook Sleeve", "Tech", 20));
			orderProductList.add(new Product(10, "Tzar", "Games", 25));
			
			orderList.add(new Order(2, new Date("2023-04-10"), null, "NEW", new Customer(4, "Harry Potter", 2),orderProductList) );
		
			orderProductList = new ArrayList<>();
			orderProductList.add(new Product(5, "Java Backend Development Live", "Course", 50));
			orderProductList.add(new Product(7, "Macbook Sleeve", "Tech", 20));
			orderProductList.add(new Product(8, "Infinte Loop Tshirt", "Apparel", 100));
			
			orderList.add(new Order(3, new Date("2023-03-22"), null, "DELIVERED", new Customer(4, "Harry Potter", 2),orderProductList) );
		

			orderProductList = new ArrayList<>();
			orderProductList.add(new Product(3, "Wheat", "Grocery", 5));
			orderProductList.add(new Product(7, "Macbook Sleeve", "Tech", 20));
			orderProductList.add(new Product(5, "Java Backend Development Live", "Course", 50));
			
			orderList.add(new Order(4, new Date("2023-03-28"), null, "DELIVERED", new Customer(4, "Harry Potter", 2),orderProductList) );
		
			orderProductList = new ArrayList<>();
			orderProductList.add(new Product(5, "Java Backend Development Live", "Course", 50));
			orderProductList.add(new Product(8, "Infinte Loop Tshirt", "Apparel", 100));
			orderProductList.add(new Product(10, "Tzar", "Games", 25));
			
			orderList.add(new Order(5, new Date("2023-03-04"), null, "PENDING", new Customer(4, "Harry Potter", 2),orderProductList) );
		

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
