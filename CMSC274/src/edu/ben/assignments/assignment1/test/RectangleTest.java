package edu.ben.assignments.assignment1.test;

import org.junit.Test;

import edu.ben.assignments.assignment1.Rectangle;
import student.TestCase;

/**
 * This is the rectangle test junit
 * 
 * @author omerb
 * @version 1.0
 */
public class RectangleTest extends TestCase {

	/**
	 * Tests out the area
	 */
	@Test
	public void testArea() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(3,6);
		
		// expected inputs
		float w = 3;
		float l = 6;

		// does the method calculation
		float expected = w * l;
		
		// makes actual variable
		float actual;
		try {
			// compares output between expected and actual
			actual = rectangle.computeArea(3,6);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * Tests out the negative area
	 */
	@Test
	public void testNegativeArea() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(-3,6);
		
		// expected inputs
		float w = -3;
		float l = 6;

		float expected = w * l;
		
		// makes actual variable
		float actual;
		try {
			// compares output between expected and actual
			actual = rectangle.computeArea(-3,6);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}
	

	/**
	 * Tests out the perimeter
	 */
	@Test
	public void testPerimeter() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(5,5);
		
		// expected inputs
		float w = 5;
		float l = 5;

		// does the method calcuation
		float expected = (2 * w + 2 * l);

		// makes actual variable
		float actual;
		try {
			// compares output between expected and actual
			actual = rectangle.computePerimeter(5,5);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}
	
	
	/**
	 * Tests out the increase dimensions of the rectangle
	 */
	@Test
	public void testIncreaseDimensions() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(4,4);
		// does the increaseDimension method
		rectangle.increaseDimensions(2,3);

		try {
			// compares input between expected and actual
			assertEquals(rectangle.getWidth(), 6, 0);
			assertEquals(rectangle.getLength(), 7, 0);
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * Tests out the diagonal computation
	 */
	@Test
	public void testDiagonal() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(5,3);
		
		// expected inputs
		float w = 5;
		float l = 3;

		// makes the expected variable
		float expected = (float) Math.sqrt(w * w + l * l);

		// makes actual variable
		float actual;
		try {
			// compares output between expected and actual
			actual = rectangle.computeDiagonal(5,3);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * Tests out greater dimensions for width
	 */
	@Test
	public void testGreaterDimensionWidth() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(5,2);
		// does the findGreaterDimension method
		rectangle.findGreaterDimension(5,2);

		try {
			// compares output between expected and actual
			assertEquals("Width is greater\n", systemOut().getHistory());
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * Tests out greater dimensions for length
	 */
	@Test
	public void testGreaterDimensionLength() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(4,5);
		// does the findGreaterDimension method
		rectangle.findGreaterDimension(4,5);

		try {
			// compares output between expected and actual
			assertEquals("Length is greater\n", systemOut().getHistory());
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * Tests out dimensions that are equal
	 */
	@Test
	public void testGreaterDimensionEqual() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(6,6);
		// does the findGreaterDimension method
		rectangle.findGreaterDimension(6,6);

		try {
			// compares output between expected and actual
			assertEquals("Width and length are equal\n", systemOut().getHistory());
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * Tests out negative dimension for width
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testIncreaseDimensionExceptionWidth() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(-1,6);
		// does the increaseDimension method
		rectangle.increaseDimensions(-1,6);
	}
	
	/**
	 * Tests out negative dimension for length
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testIncreaseDimensionExceptionLength() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(3,-5);
		// does the increaseDimension method
		rectangle.increaseDimensions(3,-5);
	}
	
	/**
	 * Test to see if the rectangle is a square
	 */
	@Test
	public void testIsSquare() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(3,3);

		// expected boolean
		boolean expected = true;

		// makes actual boolean
		boolean actual;
		try {
			// calls the check square
			actual = rectangle.isSquare();
			// compares output between expected and actual
			assertEquals(expected, actual);
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * Test to see if the rectangle is not a square
	 */
	@Test
	public void testIsNotSquare() {
		// inputs the rectangle variables
		Rectangle rectangle = new Rectangle(7,2);

		// expected boolean
		boolean expected = false;

		// makes actual boolean
		boolean actual;
		try {
			// calls the check square
			actual = rectangle.isSquare();
			// compares output between expected and actual
			assertEquals(expected, actual);
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}
}
