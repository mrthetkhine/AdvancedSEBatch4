package com.turing.advancedse4.tdd.kata.banking;

enum TransactionType
{
	DEPOSIT,
	WITHDRAW
}
public class Transaction {
	
	String date;
	TransactionType type;
	int amount;
	int balance;
	
	public Transaction(String date, TransactionType type, int amount, int balance) {
		
		this.date = date;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return date +" "+(this.type==TransactionType.DEPOSIT?"+":"-")+amount+" "+balance;
	}
	
	
}
