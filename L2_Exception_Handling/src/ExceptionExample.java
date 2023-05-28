
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		
		System.out.println("Outside Try - Start");
		
		try {
			// Files, Calculations, working database
			int c = a/0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("Outside Try - Finish");
		
		
		
		
	}

}
