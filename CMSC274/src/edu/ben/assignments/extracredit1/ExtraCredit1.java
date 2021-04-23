package edu.ben.assignments.extracredit1;

/**
 * This is my extra credit 1
 * 
 * @author omerb
 * @version 1.0
 */
public class ExtraCredit1 {
	/**
	 * The variables for a, b, and c
	 */
	private int a, b, c;

	/**
	 * This is all the variables declared
	 * 
	 * @param a the int value for a
	 * @param b the int value for b
	 * @param c the int value for c
	 */
	public ExtraCredit1(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * This is method 1
	 * 
	 * @param a int value for a
	 * @param b int value for b
	 * @param c int value for a
	 * @return a * b - b / c process the equation
	 */
	public int method1(int a, int b, int c) {
		return a * b - b / c;
	}

	/**
	 * This is method 2
	 * 
	 * @param a int value for a
	 * @param b int value for b
	 * @return a if a is greater than b, or b if it's not greater than a
	 */
	public int method2(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	/**
	 * This is method 3
	 * 
	 * @param a int value for a
	 * @param b int value for b
	 */
	private void method3(int a, int b) {
		int temp = a;
		setA(b);
		setB(temp);
	}

	/**
	 * This is method 4
	 * 
	 * @param a     int value for a
	 * @param b     int value for b
	 * @param c     int value for c
	 * @param index whatever number is in the row
	 * 
	 * @return false if there are no values when the row goes down
	 */
	public boolean method4(int a, int b, int c, int index) {
		try {
			int[] d = { a, b, c };
			System.out.println(d[index]);
			return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * This is method 5
	 * 
	 * @param a int value for a
	 * @param b int value for b
	 * @param c int value for c
	 */
	public void method5(int a, int b, int c) {
		method3(c, a);
		method3(b, c);
	}

	/**
	 * This gets value a
	 * 
	 * @return a for the value a
	 */
	public int getA() {
		return a;
	}

	/**
	 * This gets value b
	 * 
	 * @return b for the value b
	 */
	public int getB() {
		return b;
	}

	/**
	 * This gets value c
	 * 
	 * @return c for the value c
	 */
	public int getC() {
		return c;
	}

	/**
	 * This sets value a
	 * 
	 * @param a for value a
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * This sets value b
	 * 
	 * @param b for value b
	 */
	public void setB(int b) {
		this.b = b;
	}

	/**
	 * This sets value c
	 * 
	 * @param c for value c
	 */
	public void setC(int c) {
		this.c = c;
	}

}
