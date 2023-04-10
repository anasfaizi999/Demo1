package com.anas.corejava.project.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
		}
	 
	public int getCustomerNumber() {
		return customerNumber;
	  }
	
	public int setPinNumber(int pinNumber) {
	this.pinNumber = pinNumber;
	return pinNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
		}
	
	public double getCheckingBalance() {
		return checkingBalance;
		}
	
	public double getSavingBalance() {
		return savingBalance;
	  }
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
		}
	
	public double calcsavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	 }

	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
		}
	
	public double calcSavingDeposite(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
		}
	
	public void getCheckingwithdrawInput() {
		System.out.println("Checking account Balance:" + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to Withdraw from Checking account:");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New checking Account balance:" + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balnace Cannot be Negative." + "\n");
			}
		}
	
	public void getsavingwithdrawInput() {
		System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from saving Account:");
		double amount = input.nextDouble();
		
		if((savingBalance- amount) >= 0) {
			calcsavingWithdraw(amount);
			System.out.println("New saving account Balance:" + moneyFormat.format( savingBalance));
		} else {
			System.out.println("Balance Cannot be Negative." +"\n");
			}
	       }
	
	public void getCheckingDepoditInput() {
		System.out.println("Checking Account Balance :" + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to Deposite from Checking account:");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance:" + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");		
		}
	    }
	
	public void getSavingDepositInput() {
		System.out.println("Saving account Balance:" + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to Deposit from saving Account:");
		double amount = input .nextDouble();
		
		if((savingBalance + amount) >= 0) {
			calcSavingDeposite(amount);
			System.out.println("New saving Account Balance:" + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
			
			
		}
		
	}
}
	
			


