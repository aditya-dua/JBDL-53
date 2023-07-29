import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class JunitHelloWorld {
	
	Calc c;
	
	
	@BeforeClass
	public static void setupBefore() {
		
		System.out.println("@BeforeClass Called");
	}
	
	@Before
	public void setup() {
		// you can pull out value of the object.
		c = new Calc();
		System.out.println("Before Called");
	}
	
	
	@Test
	public void messgae() {
		String msg = "Hello World!";
		// interest calc...
		assertEquals("Hello World!", msg);
		System.out.println("messgae Called");
	}
	
	@Test
	public void CalcAddTest() {
		
		int sum = c.add(10, 20);
		//throw new NullPointerException();
		assertEquals(20, sum);
		System.out.println("CalcAddTest Called");
		
	}
	
	

}
