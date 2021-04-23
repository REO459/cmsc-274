package worksheet;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void test() {
		Circle circle = new Circle(4);
		circle.computeArea(4);

		float r = 4;

		float expected = (float) (Math.PI * r * r);

		try {
			float actual = circle.computeArea(4);
			assertEquals(actual, expected, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void test1() {
		Circle circle = new Circle(4);
		circle.computePerimeter(4);

		float r = 4;

		float expected = (float) (2 * Math.PI * r);

		try {
			float actual = circle.computePerimeter(4);
			assertEquals(actual, expected, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}


}
