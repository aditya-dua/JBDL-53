package l8_spring_concepts;

public class HelloWorld {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Setter of bean is called");
		this.message = message;
	}

	
	  public HelloWorld() { super();
	  System.out.println("Constructor of the HW bean called.");
	  //Auto-generated constructor stub 
	  }
	 

	
	  public HelloWorld(String message) { super(); this.message = message; }
	 
	
	public void init() {
		System.out.println("Init method of the HW bean called.");
	}
	

}
