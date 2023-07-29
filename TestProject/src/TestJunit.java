import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestJunit {

	
	@Before
	public void before() {
		System.out.println("Before Called");
	}
	
	@Test
	public void testAdd() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine", str);
	}
}
