package edu.ben.assignments.assignment1;

/**
 * This is the account class
 * 
 * @author omerb
 * @version 1.0
 */
public class Account {
	/**
	 * This is the balance variable
	 */
	protected double balance;

	/**
	 * This is the account balance
	 * 
	 * @param balance This is the balance needed
	 */
	public Account(double balance) {
		this.balance = balance;
	}

	/**
	 * This withdraws the amount
	 * 
	 * @param amount The amount of money you have
	 */
	public void withdraw(double amount) {
		// checks if the amount is sufficient
		if (checkSufficientFunds(amount)) {
			// withdraws balance
			balance -= amount;
		} else {
			// throws exception if the amount is not sufficient
			throw new ArithmeticException();
		}
	}

	/**
	 * This deposits the amount
	 * 
	 * @param amount the amount of money
	 */
	public void deposit(double amount) {
		// deposits the balance
		balance += amount;
	}

	/**
	 * Checks for sufficient funds
	 * 
	 * @param amount the amount of money you have
	 * @return (balance >= amount) if there is enough money
	 */
	private boolean checkSufficientFunds(double amount) {
		// checks if the amount is sufficient
		return (balance >= amount);
	}

	/**
	 * Gets the balance
	 * 
	 * @return balance the balance you have
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Sets the balance
	 * 
	 * @param balance the balance you have
	 */
	private void setBalance(double balance) {
		this.balance = balance;
	}
}

/**
 * This is the savings account class
 * 
 * @author omerb
 * @version 1.0
 */
class SavingsAccount extends Account {

	/**
	 * This is the interest rate
	 */
	double interestRate;

	/**
	 * This is the savings account
	 * 
	 * @param balance The amount of money you have
	 * @param interestRate The interest rate
	 */
	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	/**
	 * Gets the interest rate
	 * 
	 * @return interestRate the interest rate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * Sets the interest rate
	 * 
	 * @param interestRate the interest rate
	 */
	private void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * Gets the accrue interest
	 */
	public void accrueInterest() {
		// calculates the accrue interest
		balance *= (1 + interestRate);
	}

}
