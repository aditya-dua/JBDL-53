
public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		// BankAccount() => Default Constructor
		// When you create  class, java creates a default constructor on its own but this is created if and only if, there's no consturctor present in the class
		
		BankAccount ac1 = new BankAccount();
		
		ac1.close();
		
		BankAccount ac2 = new BankAccount(1, "ADITYA", 11);
	}

}
