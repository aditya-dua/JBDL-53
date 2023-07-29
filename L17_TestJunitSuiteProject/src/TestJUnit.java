import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestJUnit {
	
	@Test
	public void helloWorldTest() {
		
		System.out.println("TestJUnit class called");
		String msg = "HelloWorld";
		assertEquals("HelloWorld", msg);
	}

}
