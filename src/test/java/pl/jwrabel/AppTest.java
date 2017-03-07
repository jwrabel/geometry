package pl.jwrabel;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

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

	@Test
	public void equals_shouldReturnFalse(){
		Rectangle rectangle1 = new Rectangle(10,10, 200, 200);
		Rectangle rectangle2 = new Rectangle(10,10, 300, 200);


		assertNotEquals(rectangle1, rectangle2);
		// LUB
		assertFalse(rectangle1.equals(rectangle2));
	}

	@Test
	public void equals_shouldReturnFalseForNull(){
		Rectangle rectangle1 = new Rectangle(10,10, 200, 200);
		Rectangle rectangle2 = null;

		assertNotEquals(rectangle1, rectangle2);
	}
}
