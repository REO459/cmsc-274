package edu.ben.assignments.assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This is my assignment4 class
 * 
 * @author omerb
 * @version 1.0
 */
public class Assignment4 {

	/**
	 * This is my default constructor
	 */
	private Assignment4() {

	}

	/**
	 * This is where it shows who turn it is
	 */
	private static boolean turn = false;

	/**
	 * This keeps track of the actions in the code
	 */
	private static int i = 0;

	/**
	 * This is where it process the compute method
	 * 
	 * @param args the string args
	 * @throws FileNotFoundException if there is no file
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// creates the files for cards and actions
		File f1 = new File("Cards.txt");
		File f2 = new File("Actions.txt");

		// does the compute method
		compute(f1, f2);
	}

	/**
	 * computes the file
	 * 
	 * @param f1 the card file
	 * @param f2 the action file
	 * @throws FileNotFoundException if there is no file
	 */
	public static void compute(File f1, File f2) throws FileNotFoundException {
		// the sums for the player and dealer
		double playerSum = 0;
		double dealerSum = 0;

		// the scanners for cards and actions
		Scanner cardsFile = new Scanner(f1);
		Scanner actionsFile = new Scanner(f2);

		// adds the cards and action list
		// this shows high cohesion because I called the methods from the Files class to
		// here
		Files.listOfCards(cardsFile);
		Files.listOfActions(actionsFile);

		// starts to loop through the action

		// this represents information expert because the game needs
		// to determine the actions of the player
		for (i = 0; i < Files.ACTIONS.size(); i++) {
			// makes sure that the player goes first
			while (i < Files.ACTIONS.size() && !Files.ACTIONS.get(i).equals("Player")) {
				i++;
			}
			// starts the game with 0 points for player and dealer
			playerSum = 0;
			dealerSum = 0;
			turn = false;
			// declares the winner of the game when the round is over
			playerSum = gameTurn(playerSum, "Player", "Dealer");
			if (turn) {
				continue;
			}
			if (i < Files.ACTIONS.size() && Files.ACTIONS.get(i).equals("Stay")) {
				i++;
			}
			// calls the turn method so it is the dealer's turn
			dealerSum = gameTurn(dealerSum, "Dealer", "Player");
			// if the dealer goes over 7.5 then the player wins
			if (turn) {
				continue;
			}
			// if either one has 0, it goes on the next round
			if (playerSum == 0 || dealerSum == 0) {
				continue;
			}

			// determines the outcome of the game
			determineOutcome(playerSum, dealerSum);
		}

		// checks if there is not enough cards there
		if (!Files.cardsInDeck()) {
			System.out.println("Not enough cards");
		}

	}

	/**
	 * The turns of the game
	 * 
	 * This also represents information expert because it is getting the cards and
	 * actions
	 * 
	 * @param totalSum The total sum of the cards
	 * @param player   The player of the game
	 * @param dealer   The dealer of the game
	 * @return totalSum The total number of the cards you got
	 */
	public static double gameTurn(double totalSum, String player, String dealer) {
		// starts the game with actions and player
		if (i < Files.ACTIONS.size() && Files.cardsInDeck() && Files.ACTIONS.get(i).equals(player) && totalSum == 0) {
			// adds the number the card was drawn and remove it from the deck
			totalSum += Files.CARDS.removeFirst();
			i++;
			// if the action says hit
			while (Files.cardsInDeck() && Files.ACTIONS.get(i).equals("Hit")) {
				// adds up the card and removes from deck
				totalSum += Files.CARDS.removeFirst();
				// if the player is above 7.5, then the dealer wins
				if (totalSum > 7.5) {
					System.out.println("Winner = " + dealer);
					turn = true;
					break;
				}
				// adds a turn
				i++;
			}
		}
		// returns the total sum
		return totalSum;
	}

	/**
	 * Determines who wins the game
	 * 
	 * @param playerSum the number of the player
	 * @param dealerSum the number of the dealer
	 */
	public static void determineOutcome(double playerSum, double dealerSum) {
		// checks if there is a draw
		if (playerSum == dealerSum) {
			System.out.println("Draw");
			// checks if there is a player winner
		} else if (playerSum > dealerSum) {
			System.out.println("Winner = Player");
			// checks if there is a dealer winner
		} else if (dealerSum > playerSum) {
			System.out.println("Winner = Dealer");
		}
	}

}