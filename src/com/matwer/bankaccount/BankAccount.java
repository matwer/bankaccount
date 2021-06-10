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

	public String getCheckingBal() {
		String checking = String.format("%.2f", checkingBal);
		return checking;
	}

	public String getSavings() {
		String saving = String.format("%.2f", savings);
		return saving;
	}

	public String getAcctNum() {
		return this.accountNum;
	}
	
	public static int getTotalAccts() {
		return totAccts;
	}

	public static String getTotalBalance() {
		String total = String.format("%.2f", totalBalance);
		return total;
	}
	
	public void checkDep(double dep) {
		String deposit = String.format("%.2f", dep);
		System.out.println("Depositing " + deposit + " into checking");
		this.checkingBal += dep;
		totalBalance += dep;
	}
	
	public void savingsDep (double dep ) {
		String deposit = String.format("%.2f", dep);
		System.out.println("Depositing " + deposit + " into savings");
		this.savings += dep;
		totalBalance += dep;
	}
	
	public void withdrawCheck (double wd) {
		if (this.checkingBal < wd) {
			System.out.println("Insufficient funds. Unable to withdraw " + wd);
		} else {
			this.checkingBal -= wd;
			String withdrawal = String.format("%.2f", wd);
			System.out.println("Withdrawing " + withdrawal + " from checking");
			totalBalance -= wd;
		}
	}
	
	public void withdrawSavings (double wd) {
		if (this.savings < wd) {
			System.out.println("Insufficient funds. Unable to withdraw " + wd);
		} else {
			this.savings -= wd;
			String withdrawal = String.format("%.2f", wd);
			System.out.println("Withdrawing " + withdrawal + " from savings");
			totalBalance -= wd;
		}
	}
}
