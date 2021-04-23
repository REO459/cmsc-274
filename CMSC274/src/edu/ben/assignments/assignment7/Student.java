package edu.ben.assignments.assignment7;

import java.util.Arrays;

/**
 * This is my student class
 * 
 * @author omerb
 * @version 1.0
 */
public class Student implements Comparable<Student> {
	/**
	 * The variables for first and last name
	 */
	private String firstName, lastName;

	/**
	 * The variable for major
	 */
	private String[] major;

	/**
	 * The constructor for student
	 * 
	 * @param firstName student's first name
	 * @param lastName  student's last name
	 * @param major     student's major
	 */
	public Student(String firstName, String lastName, String[] major) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
	}

	/**
	 * Gets first name
	 * 
	 * @return firstName first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets last name
	 * 
	 * @return lastName last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Gets major
	 * 
	 * @return major the major
	 */
	public String[] getMajor() {
		return major;
	}

	/**
	 * This is the hash code method
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + Arrays.hashCode(major);
		return result;
	}

	/**
	 * This is the equals method
	 */
	@Override
	public boolean equals(Object obj) {
		// if the object equals
		if (this == obj)
			return true;
		// if the object is null
		if (obj == null)
			return false;
		// if the get class does not equal the object
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		// if firstname is null
		if (firstName == null) {
			// if the other firstname is not null
			if (other.firstName != null)
				return false;
			// if the firstname equals the other firstname
		} else if (!firstName.equals(other.firstName))
			return false;
		// if the lastname is null
		if (lastName == null) {
			// if the other lastname is not null
			if (other.lastName != null)
				return false;
			// if the last name does not equals to the other lastname
		} else if (!lastName.equals(other.lastName))
			return false;
		// if the array does not equal to the other major
		if (!Arrays.equals(major, other.major))
			return false;
		return true;
	}

	/**
	 * This converts to the string
	 */
	@Override
	public String toString() {
		return "firstName= " + firstName + ", lastName= " + lastName + ", major= " + Arrays.toString(major);
	}

	/**
	 * This is the compare to method
	 */
	@Override
	public int compareTo(Student o) {
		// sorts the array
		if (major != null) {
			Arrays.sort(major);
			// creates the string array
		} else {
			major = new String[] {};
		}
		// sorts the compare to array
		if (o.major != null) {
			Arrays.sort(o.major);
			// creates the compare to array
		} else {
			o.major = new String[] {};
		}

		// initializes last name comparison and compares with first name
		int comparison = lastName.compareTo(o.lastName);
		comparison = (comparison != 0 ? comparison : firstName.compareTo(o.firstName));
		if (comparison != 0) {
			return comparison;
		}

		// initializes the length of the major array
		int majorLength = major.length;

		if (o.major.length < majorLength) {
			majorLength = o.major.length;
		}

		// loops through the array to compare the majors
		for (int i = 0; i < majorLength; i++) {
			comparison = major[i].compareTo(o.major[i]);
			if (comparison != 0) {
				return comparison;
			}
		}

		// returns the comparisons of the comparator
		if (major.length == o.major.length) {
			return 0;
		} else if (major.length < o.major.length) {
			return -1;
		} else {
			return 1;
		}
	}

	/**
	 * This clones the variables
	 */
	@Override
	public Object clone() {
		Student cloneStudent;
		try {
			cloneStudent = new Student(this.firstName, this.lastName, this.major);
			return cloneStudent;
		} catch (Exception cl) {
			cl.printStackTrace();
			return null;
		}
	}
}
