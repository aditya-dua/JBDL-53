
public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//divide(10, 0);
		
		try {
			divide(10, 0);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		System.out.println("sysout works");
	}
	
	public static double divide(int num,int deno) throws ArithmeticException{
				
		
		return num/deno;
	}

}
