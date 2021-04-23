package edu.ben.circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testPositiveArea() {
		Circle circle = new Circle(3);
		float r = 3;
		float expected = (float) (Math.PI * r * r);
		try {
			float actual = circle.computeArea(3);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testNegativeArea() {
		Circle circle = new Circle(-1);
		float expected = -1;
		try {
			float actual = circle.computeArea(-1);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testPositivePerimeter() {
		Circle circle = new Circle(3);
		float r = 3;
		float expected = (float) (2 * Math.PI * r);
		try {
			float actual = circle.computePerimeter(3);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testNegativePerimeter() {
		Circle circle = new Circle(-1);
		float expected = -1;
		try {
			float actual = circle.computePerimeter(-1);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

}
