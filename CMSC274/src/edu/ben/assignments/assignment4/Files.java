package edu.ben.assignments.assignment4;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * This is my files class
 * 
 * This class represents high cohesion because it is working on text file
 * related conversions to the cards and actions
 * 
 * @author omerb
 * @version 1.0
 */
public class Files {

	/**
	 * This is my default constructor
	 */
	private Files() {

	}

	/**
	 * This is the linked list for cards
	 */
	static final LinkedList<Double> CARDS = new LinkedList<Double>();

	/**
	 * This is the linked list for actions
	 */
	static final LinkedList<String> ACTIONS = new LinkedList<String>();

	/**
	 * Removes the commas for the action list
	 * 
	 * @param scanActions the actions text file
	 */
	public static void listOfActions(Scanner scanActions) {
		// removes the commas
		while (scanActions.hasNext()) {
			ACTIONS.add(scanActions.next().replaceAll(",", ""));
		}
	}

	/**
	 * Converts the text file to doubles
	 * 
	 * @param scanCards the cards text file
	 */
	public static void listOfCards(Scanner scanCards) {
		// reads through the cards and check if they are double
		while (scanCards.hasNextDouble()) {
			CARDS.add(scanCards.nextDouble());
		}

	}

	/**
	 * This is where to check if there are cards in the deck
	 * 
	 * @return true if there are cards on the text file
	 */
	public static boolean cardsInDeck() {
		// checks if the text file has less than or equal to 0 cards
		if (CARDS.size() <= 0) {
			return false;
		} else {
			// if there are cards
			return true;
		}
	}
}