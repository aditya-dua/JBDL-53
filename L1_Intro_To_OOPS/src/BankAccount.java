
public class BankAccount {
	
	int id;
	String name;
	int bal;
	static int counter;
	
	
	// Parameteriseid constructor
	
	public BankAccount(int id, String name, int bal) {
		this(id,name);
		this.bal=bal;
	}
	
	
	public BankAccount(int id, String name) {
		this();
		this.id=id;
		this.name=name;
	}
	
	public BankAccount() {
		counter++;
		// TODO Auto-generated constructor stub
	}
	
	// Two Constructors with the same name is known as CONSTRUCTOR OVERLOADING and this is a part of Polymorphism.
	
	
	
	public void withdraw() {
		System.out.println("Withdraw Successfull!");
	}
	
	
	public void close() {
		System.out.println("Account Closed!");
	}
	

}
