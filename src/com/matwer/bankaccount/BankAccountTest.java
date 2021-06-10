package com.matwer.bankaccount;

public class BankAccountTest {
		
	public static void main(String[] args) {
		// create some accounts
		BankAccount acct1 = new BankAccount();
		BankAccount acct2 = new BankAccount();
		BankAccount acct3 = new BankAccount();
		
		// make some deposits & withdrawals and print the balance
		acct1.checkDep(100.00);
		acct1.withdrawCheck(25.00);
		System.out.println("Checking account balance for account " + acct1.getAcctNum() + " is " + acct1.getCheckingBal());
		acct1.savingsDep(200.00);
		acct1.withdrawSavings(2500.00);
		acct1.withdrawSavings(25.00);
		System.out.println("Saving account balance for account " + acct1.getAcctNum() + " is " + acct1.getSavings());
			
		acct2.checkDep(1000.00);
		acct2.withdrawCheck(500.00);
		System.out.println("Checking account balance for account " + acct2.getAcctNum() + " is " + acct2.getCheckingBal());
		acct2.savingsDep(2000.00);
		acct2.withdrawSavings(500.00);
		System.out.println("Saving account balance for account " + acct2.getAcctNum() + " is " + acct2.getSavings());
			
		acct3.checkDep(10000.00);
		acct3.withdrawCheck(1500.00);
		System.out.println("Checking account balance for account " + acct3.getAcctNum() + " is " + acct3.getCheckingBal());
		acct3.savingsDep(25000.00);
		acct3.withdrawSavings(2500.00);
		System.out.println("Saving account balance for account " + acct3.getAcctNum() + " is " + acct3.getSavings());
		
		// print the total # of accounts and the total balance across all accounts
		System.out.println("\nTotal # of accountsz: " + BankAccount.getTotalAccts());
		System.out.println("Total balance of all accounts: " + BankAccount.getTotalBalance());			
	}
}
