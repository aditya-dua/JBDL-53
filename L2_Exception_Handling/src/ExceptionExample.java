
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int arr[]= {1,2,3,4};
		System.out.println("Outside Try - Start");
		
		try {
			// Files, Calculations, working database
			int c = a/0;
			System.out.println(arr[5]);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("Outside Try - Finish");
		
		
		
		
	}

}
