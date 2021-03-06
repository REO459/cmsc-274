package edu.ben.assignments.assignment6;

import java.awt.EventQueue;
import java.util.List;

/**
 * This is my generic class
 * 
 * @author omerb
 * @version 1.0
 *
 * @param <T> The generic
 */
public class GenericMethods<T extends Comparable<T>> {

	/**
	 * This starts up the software
	 * 
	 * @param args the software
	 */
	public static void main(String[] args) {
		runSoftware();
	}

	/**
	 * runs the software
	 */
	public static void runSoftware() {
		EventQueue.invokeLater(new Runnable() {
			/**
			 * running
			 */
			public void run() {
				// makes the gui to start the software
				try {
					GenericMethodsGUI frame = new GenericMethodsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * This is where it finds the smallest value
	 * 
	 * @param list  the list you provided
	 * @param start the start of the list
	 * @param end   the end of the list
	 * @return smallestValue when the smallest value has been found
	 */
	public T findSmallest(List<T> list, int start, int end) {
		// gets the smallest value
		T smallestValue = list.get(start);
		// compares the other values to see if they are smallest
		for (int i = start; i < end; i++) {
			if (smallestValue.compareTo(list.get(i)) > 0) {
				smallestValue = list.get(i);
			}
		}
		return smallestValue;
	}

	/**
	 * This is where it exchanges the elements
	 * 
	 * @param array    the array you have inputed
	 * @param indexOne the the first index
	 * @param indexTwo the second index
	 * @return true if the input is valid
	 */
	public boolean exchangeElements(T[] array, int indexOne, int indexTwo) {
		// return false if the index is invalid
		if ((indexOne < 0 || indexOne > array.length) || (indexTwo < 0 || indexTwo > array.length)) {
			return false;
			// return true if the index is valid
		} else {
			T elementAtIndexOne = array[indexOne];
			array[indexOne] = array[indexTwo];
			array[indexTwo] = elementAtIndexOne;
			return true;
		}
	}
}
