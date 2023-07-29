import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestJUnit3 {
	
	@Test
	public void helloWorldTest() {
		
		System.out.println("TestJUnit3 class called");
		String msg = "HelloWorld";
		assertEquals("HelloWorld", msg);
	}

}
