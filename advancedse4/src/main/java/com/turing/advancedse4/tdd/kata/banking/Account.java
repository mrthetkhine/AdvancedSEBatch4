package com.turing.advancedse4.tdd.kata.banking;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int balance = 0;
	public static String HEADER="Date        Amount  Balance\n";
	public static String DATE = "29/12/2023";
	
	private List<Transaction> transactions = new ArrayList<Transaction>();
	
	void deposit(int amount)
	{
		if(amount >=0)
		{
			this.balance += amount;
			addTransaction(TransactionType.DEPOSIT,amount);
		}
		
	}
	
	public void withdraw(int amount) {
		if(amount >0 && this.balance>= amount)
		{
			this.balance -= amount;
			addTransaction(TransactionType.WITHDRAW,amount);
		}
		
		
	}
	private void addTransaction(TransactionType type,int amount) {
		Transaction transaction = new Transaction(DATE, type, amount, balance);
		this.transactions.add(transaction);
	}
	String printStatement()
	{
		String result = HEADER;
		
		for(Transaction tran : this.transactions)
		{
			result+=tran+"\n";
		}
		
		return result;
	}

	
}
