package edu.ben.assignments.assignment1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ben.assignments.assignment1.Account;

/**
 * This is the account test junit
 * 
 * @author omerb
 * @version 1.0
 */
public class AccountTest {

	/**
	 * Tests out the withdraw
	 */
	@Test
	public void testWithdraw() {
		// inputs for the account variables
		Account account = new Account(420);
		account.withdraw(120);
		try {
			// compares output between expected and actual
			assertEquals(account.getBalance(), 300, 0);
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}

	
	/**
	 * Tests out the withdraw that does not have sufficient funds
	 */
	@Test (expected = ArithmeticException.class)
	public void testWithdrawNegative() {
		// inputs for the account variables
		Account account = new Account(420);
		// calls withdraw
		account.withdraw(520);
	}
	
	/**
	 * Test out the deposit
	 */
	@Test
	public void testDeposit() {
		// inputs for the account variables
		Account account = new Account(150);
		// calls deposit
		account.deposit(800);
		try {
			// compares output between expected and actual
			assertEquals(account.getBalance(), 950, 0);
		} catch (Exception e) {
			// fails if the expected and actual fails
			fail("Should not have thrown exception");
		}
	}

}
