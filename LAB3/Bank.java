
// Author: Paul Liakhov
// #: 108048166
// Date: 2018/02/06

import java.util.ArrayList;

public class Bank {

	private String b_name;
	private ArrayList<Account> accounts;

	public Bank() {
		this.b_name = "Seneca@York";
		this.accounts = new ArrayList<Account>();
	}

	public Bank(String banco) {
		this.b_name = banco;
		this.accounts = new ArrayList<Account>();
	}

	/*
	 * Function: addAccount()
	 * -----------------------
	 * Function to append account to
	 * the existing array of accounts.
	 * 
	 */
	public boolean addAccount(Account newAccount) {

		boolean flag = true;// Default assumes no existing accounts exist

		if (newAccount != null) {

			// Iterate through the array to check for Existing Accounts/Account Numbers
			for (int i = 0; i < this.accounts.size(); i++) {

				// If Accounts have the same number
				if (this.accounts.get(i).getAccountNumber() == newAccount.getAccountNumber()) {
					flag = false;
				}

			}

			// add the flag
			if (flag == true) {
				accounts.add(newAccount);
			}

		} else {
			flag = false;
		}

		return flag;

	}

	public String getBankName() {
		return this.b_name;
	}

	/*
	 * Function: toString()
	 * --------------------
	 * Function to display the name of the bank 
	 * and the accounts of the bank. 
	 * 
	 */
	public String toString() {

		String ts;

		ts = "*** Welcome to the Bank of " + 
		this.b_name + " ***\n" + "It has " + this.accounts.size() + " accounts.\n";

		for (int i = 0; i < accounts.size(); i++) {
			ts += i + 1 + ". number: " + this.accounts.get(i).getAccountNumber() + ", name: " + this.accounts.get(i).getFullName()
					+ ", balance: $" + this.accounts.get(i).getAccountBalance() + "\n";
		}
		return ts;
	}

	/*
	 * Function: equals
	 * ------------------
	 * Function to pass in an object and 
	 * return true, if the object passed in is of type 
	 * bank, 
	 * 
	 */
	public boolean equals(Object e) {

		// Assumes everything is the same
		boolean flag = true;

		if (e instanceof Bank) {

			Bank Tes = (Bank) e;
			
			// Check that the two Banks have the same name 
			if (this.b_name == Tes.getBankName()) {

				// Iterate through both Banks checking that they have the Exact Same Accounts
				for (int i = 0; i < this.accounts.size(); i++) {

					
					if (!this.accounts.get(i).equals(Tes.accounts.get(i))) {
						flag = false;
					}

				}

			}
			else {
				
				// The names are not the same
				flag = false;
			
			}

		}
		else {
		
			// The object passed is not of type Bank
			flag = false;
		
		}
		
		return flag;

	}
	
	/*	Function: searchByBalance( int balance )
	 *  --------------------------
	 *  Function to pass in a balance,
	 *  search the bank for accounts 
	 *  with corresponding balance, and return
	 *  the respective array containing 
	 *  those balances.
	 * 
	 */
	public Account[] searchByBalance(int balance) {

		int noMatch = 0;

		// To get the size of matches
		for (int i = 0; i < this.accounts.size(); i++) {

			if (this.accounts.get(i).getAccountBalance() == balance) {
				noMatch++;
			}

		}

		// Set the size of the array
		Account[] matches = new Account[noMatch];

		noMatch = 0;

		// Populating the Array
		for (int i = 0; i < accounts.size(); i++) {

			if (this.accounts.get(i).getAccountBalance() == balance) {
				matches[noMatch] = this.accounts.get(i);
				noMatch++;
			}

		}

		// No matches have been found
		if (noMatch == 0) {
			matches = new Account[0];
		}

		return matches;

	}

}
