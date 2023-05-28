
public class RegisterForm {

	public static void main(String[] args) {
		
		try {
			register("Aditya",10);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void register(String name, int age) throws InvalidAgeException {
		
		if(age>18) {
			
		}else {
			throw new InvalidAgeException(age+" cannot be less than 18.");
		}
		System.out.println("Test ");
	}
}
