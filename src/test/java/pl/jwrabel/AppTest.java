package pl.jwrabel;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void equals_shouldReturnTrue(){
		Rectangle rectangle1 = new Rectangle(10,10, 200, 200);
		Rectangle rectangle2 = new Rectangle(10,10, 200, 200);


		assertEquals(rectangle1, rectangle2);
		// LUB
		//		assertTrue(rectangle1.equals(rectangle2));
	}
}
