
public class ArrayExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,6};
		
		try {
			System.out.println(a[5]);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			System.out.println("In Finally");
		}
		
	}

}
