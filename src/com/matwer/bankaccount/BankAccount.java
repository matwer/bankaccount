package com.matwer.bankaccount;

import java.util.Random;

public class BankAccount {
	
	// declare member variables
	private String accountNum = "";
	private double checkingBal = 0.0;
	private double savings = 0.0;
	
	private static int totAccts;
	private static double totalBalance;

	public BankAccount() {
		// member variables
		accountNum = newAcct();
		totAccts++;
	}
	
	private String newAcct() {
		Random rnd = new Random();
		
		for (int i = 0; i < 10; i++) {
			accountNum += rnd.nextInt(10);
		}
		return accountNum;
	}

	public double getCheckingBal() {
		return checkingBal;
	}

	public double getSavings() {
		return savings;
	}

	public String getAcctNum() {
		return this.accountNum;
	}
	
	public static int getTotalAccts() {
		return totAccts;
	}

	public static double getTotalBalance() {
		return totalBalance;
	}
	
	public void checkDep(double dep) {
		System.out.println("Depositing " + dep + " into checking");
		this.checkingBal += dep;
		totalBalance += dep;
	}
	
	public void savingsDep (double dep ) {
		System.out.println("Depositing " + dep + " into savings");
		this.savings += dep;
		totalBalance += dep;
	}
	
	public void withdrawCheck (double wd) {
		if (this.checkingBal < wd) {
			System.out.println("Insufficient funds. Unable to withdraw " + wd);
		} else {
			this.checkingBal -= wd;
			System.out.println("Withdrawing " + wd + " from checking");
			totalBalance -= wd;
		}
	}
	
	public void withdrawSavings (double wd) {
		if (this.savings < wd) {
			System.out.println("Insufficient funds. Unable to withdraw " + wd);
		} else {
			this.savings -= wd;
			System.out.println("Withdrawing " + wd + " from savings");
			totalBalance -= wd;
		}
	}
}
