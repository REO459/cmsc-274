package edu.ben.assignments.assignment7.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ben.assignments.assignment7.Student;

/**
 * This is my student test junit
 * 
 * @author omerb
 * @version 1.0
 */
public class StudentTest {
	
	/**
	 * This test out the equals method
	 */
	@Test
	public void testEquals() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", "Charlie", major);
		try {
			// compares the results
			assertTrue(bob.equals(bob));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This test out the equals method if there is null
	 */
	@Test
	public void testNullEquals() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", "Charlie", major);
		Student empty = null;
		try {
			// compares the results
			assertFalse(bob.equals(empty));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This test out the equals method for number
	 */
	@Test
	public void testNumberEquals() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", "Charlie", major);
		Integer number = new Integer(17);
		try {
			// compare the results
			assertFalse(bob.equals(number));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This test out the equals method for first name is null for fox
	 */
	@Test
	public void testFirstNameEquals() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", "Charlie", major);
		Student fox = new Student(null, "Fox", major);
		try {
			// compares the results
			assertFalse(bob.equals(fox));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This test out the equals method for first name is null for bob
	 */
	@Test
	public void testNullFirstNameEquals() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student(null, "Charlie", major);
		Student fox = new Student("Star", "Fox", major);
		try {
			// compares the results
			assertFalse(bob.equals(fox));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	
	/**
	 * This test out the equals method for last name is null for mike
	 */
	@Test
	public void testSecondNullLastNameEquals() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", "Charlie", major);
		Student mike = new Student("Mike", null, major);
		try {
			// compares the results
			assertFalse(bob.equals(mike));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	/**
	 * This test out the equals method for last name is null for bob
	 */
	@Test
	public void testFirstNullLastNameEquals() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", null, major);
		Student mike = new Student("Mike", "Ross", major);
		try {
			// compares the results
			assertFalse(bob.equals(mike));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the equals method for bobby having more majors
	 */
	@Test
	public void testMoreMajorsEquals() {
		// input the variables
		String[] major = { "Accounting" };
		String[] moreMajors =  { "Accounting", "Business Analytics" };
		Student bob = new Student("Bob", "Charlie", major);
		Student bobby = new Student("Bob", "Charlie", moreMajors);
		try {
			// compares the results
			assertFalse(bob.equals(bobby));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the to string method 
	 */
	@Test
	public void testToString() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", "Charlie", major);
		String expected = "firstName= Bob, lastName= Charlie, major= [Accounting]";
		String actual = bob.toString();
		try {
			// compares the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the to string method with multiple majors
	 */
	@Test
	public void testToStringMultipleMajors() {
		// input the variables
		String[] major = { "Accounting", "Computer Science" };
		Student bob = new Student("Bob", "Charlie", major);
		String expected = "firstName= Bob, lastName= Charlie, major= [Accounting, Computer Science]";
		String actual = bob.toString();
		try {
			// compares the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the to string method if first name is empty
	 */
	@Test
	public void testToStringFirstNameEmpty() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student(null, "Charlie", major);
		String expected = "firstName= null, lastName= Charlie, major= [Accounting]";
		String actual = bob.toString();
		try {
			// compares the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the to string method if last name is empty
	 */
	@Test
	public void testToStringLastNameEmpty() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", null, major);
		String expected = "firstName= Bob, lastName= null, major= [Accounting]";
		String actual = bob.toString();
		try {
			// compares the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the to string method if major is empty
	 */
	@Test
	public void testToStringMajorEmpty() {
		// input the variables
		String[] major = {};
		Student bob = new Student("Bob", "Charlie", major);
		String expected = "firstName= Bob, lastName= Charlie, major= []";
		String actual = bob.toString();
		try {
			// compares the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the compare to method with different names results
	 */
	@Test
	public void testCompareToDifferent() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", "Charlie", major);
		Student joe = new Student("Joe", "Mile", major);
		try {
			// compares the results
			assertEquals(-10, bob.compareTo(joe));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the compare to method with same names and major results
	 */
	@Test
	public void testCompareToSame() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", "Charlie", major);
		Student bobby = new Student("Bob", "Charlie", major);
		try {
			// compares the results
			assertEquals(0, bob.compareTo(bobby));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the compare to method with same names and major results
	 */
	@Test
	public void testCompareToSameLastNames() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Toad", "Stool", major);
		Student lombard = new Student("Rosa", "Stool", major);
		try {
			// compares the results
			assertEquals(2, bob.compareTo(lombard));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the compare to method with bobby having more majors
	 */
	@Test
	public void testCompareToBobbyHasMoreArrays() {
		// input the variables
		String[] major = { "Accounting" };
		String[] majorTwo = { "Accounting", "Computer Science" };
		Student bob = new Student("Bob", "Charlie", major);
		Student bobby = new Student("Bob", "Charlie", majorTwo);
		try {
			// compares the results
			assertEquals(-1, bob.compareTo(bobby));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the compare to method with bob having more majors
	 */
	@Test
	public void testCompareToBobHasMoreArrays() {
		// input the variables
		String[] major = { "Accounting" };
		String[] majorTwo = { "Accounting", "Computer Science" };
		Student bob = new Student("Bob", "Charlie", majorTwo);
		Student bobby = new Student("Bob", "Charlie", major);
		try {
			// compares the results
			assertEquals(1, bob.compareTo(bobby));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the compare to method if both don't have majors
	 */
	@Test
	public void testNullArrays() {
		Student bob = new Student("Bob", "Charlie", null);
		Student bobby = new Student("Bob", "Charlie", null);
		try {
			// compares the results
			assertEquals(0, bob.compareTo(bobby));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	/**
	 * This test out the clone method
	 */
	@Test
	public void testClone() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", "Charlie", major);
		try {
			// compares the results
			assertEquals(bob, bob.clone());
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the clone method with null
	 */
	@Test
	public void testNullClone() {
		// input the variables
		Student bob = new Student(null, null, null);
		try {
			// compares the results
			assertEquals(bob, bob.clone());
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This test out the clone method with null
	 */
	@Test
	public void testDifferentClone() {
		// input the variables
		String[] major = {"Accounting"};
		String[] newMajor = {"Business Analytics"};
		Student bob = new Student("Bob", "Charlie", major);
		Student bobClone = (Student) bob.clone();
		bob = new Student("Bob", "Swift", newMajor);
		try {
			// compares the results
			assertFalse(bob.equals(bobClone));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This test out the clone method with null to whole
	 */
	@Test
	public void testNullToWholeClone() {
		// input the variables
		String[] major = {"Accounting"};
		Student bob = new Student(null, null, null);
		Student bobClone = (Student) bob.clone();
		bob = new Student("Bob", "Swift", major);
		try {
			// compares the results
			assertFalse(bob.equals(bobClone));
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}


	/**
	 * This test out the hash code method
	 */
	@Test
	public void testHashCode() {
		// input the variables
		String[] major = { "Accounting" };
		Student bob = new Student("Bob", "Charlie", major);
		Student bobClone = (Student) bob.clone();
		try {
			// compares the results
			assertEquals(bob.hashCode(), bobClone.hashCode());
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * This test out the hashcode method with null
	 */
	@Test
	public void testNullHashCode() {
		// input the variables
		Student bob = new Student(null, null, null);
		Student bobClone = (Student) bob.clone();
		try {
			// compares the results
			assertEquals(bob.hashCode(), bobClone.hashCode());
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
}
