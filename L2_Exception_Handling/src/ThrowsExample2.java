import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fileOpen("/");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		
		}catch(Exception e) {
			
		}
		
		
		
		System.out.println("sysout works");
	}
	
	public static void fileOpen(String path) throws FileNotFoundException,ArithmeticException {
				
		
		FileReader f = new FileReader(path);
		BufferedReader br = new BufferedReader(f);
		
		
	}

}
