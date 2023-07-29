import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestJUnit {
	
	@Test
	public void helloWorldTest() {
		
		String msg = "HelloWorld";
		assertEquals("HelloWorld", msg);
	}

}
