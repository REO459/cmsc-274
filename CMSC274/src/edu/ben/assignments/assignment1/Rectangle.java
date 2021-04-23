package edu.ben.assignments.assignment1;

/**
 * This is the rectangle class
 * 
 * @author omerb
 * @version 1.0
 */
public class Rectangle {

	/**
	 * Private variables for width and length
	 */
	private float width, length;

	/**\
	 * This lists the width and length
	 * 
	 * @param width The width of the rectangle
	 * @param length The length of the rectangle
	 */
	public Rectangle(float width, float length) {
		// sets width and length
		this.width = width;
		this.length = length;
	}

	/**
	 * This computes the area
	 * 
	 * @param w The width of the rectangle
	 * @param l The length of the rectangle
	 * @return (w * l) computation of the area
	 */
	public float computeArea(float w, float l) {
		// computes area
		return (w * l);
	}

	/**
	 * This computes the perimeter
	 * 
	 * @param w The width of the rectangle
	 * @param l The length of the rectangle
	 * @return (2 * w + 2 * l) computation of the perimeter
	 */
	public float computePerimeter(float w, float l) {
		// computes perimeter
		return (2 * w + 2 * l);
	}

	/**
	 * This increases the dimensions
	 * 
	 * @param newWidth This is the new width
	 * @param newLength This is the new length
	 */
	public void increaseDimensions(int newWidth, int newLength) {
		// checks to see if there are not negative numbers
		if (newWidth <= 0 || newLength <= 0) {
			throw new IllegalArgumentException();
		}
		// increases the dimensions
		width += newWidth;
		length += newLength;
	}

	/**
	 * Computes the diagonal 
	 * 
	 * @param w The width of the rectangle
	 * @param l The length of the rectangle
	 * @return (float) (Math.sqrt(w * w + l * l)) the compute for diagonal
	 */
	public float computeDiagonal(float w, float l) {
		// computes diagonal
		return (float) (Math.sqrt(w * w + l * l));
	}

	/**
	 * This finds the greater dimensions
	 * 
	 * @param w The width of the rectangle
	 * @param l The length of the rectangle
	 */
	public void findGreaterDimension(float w, float l) {
		// if width is greater than length
		if (w > l) {
			System.out.println("Width is greater");
		// if length is greater than width
		} else if (w < l) {
			System.out.println("Length is greater");
		// if both are equal
		} else {
			System.out.println("Width and length are equal");
		}
	}

	/**
	 * Checks if it is a square
	 * 
	 * @return (length == width) if the length matches the width, it's a square.
	 */
	public boolean isSquare() {
		// checks if the length matches width
		return (length == width);
	}

	/**
	 * Gets the width
	 * 
	 * @return width the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * Gets the length
	 * 
	 * @return length the length
	 */
	public float getLength() {
		return length;
	}

}