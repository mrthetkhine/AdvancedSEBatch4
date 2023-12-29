package com.turing.advancedse4.tdd.kata.banking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankingTest {
	@Test
	public void testDeposit()
	{
		Account account = new Account();
		account.deposit(500);
		
		String statement = account.printStatement();
		
		String expected = Account.HEADER
						 +"29/12/2023 +500 500\n";
		assertEquals(expected,statement);
	}
	@Test
	public void testDepositWithMultipleValue()
	{
		Account account = new Account();
		account.deposit(500);
		account.deposit(200);
		String statement = account.printStatement();
		
		String expected = Account.HEADER
						 +"29/12/2023 +500 500\n"
						 +"29/12/2023 +200 700\n";
		assertEquals(expected,statement);
	}
	@Test
	public void testDepositWithNegativeValue()
	{
		Account account = new Account();
		account.deposit(-500);
		account.deposit(200);
		String statement = account.printStatement();
		
		String expected = Account.HEADER
						 +"29/12/2023 +200 200\n";
		assertEquals(expected,statement);
	}
	@Test
	public void testWithdraw()
	{
		Account account = new Account();
		account.deposit(500);
		account.withdraw(200);
		
		String statement = account.printStatement();
		
		String expected = Account.HEADER
						 +"29/12/2023 +500 500\n"
						 +"29/12/2023 -200 300\n";
		assertEquals(expected,statement);
	}
	@Test
	public void testWithdrawWithNegativeAmount()
	{
		Account account = new Account();
		account.deposit(500);
		account.withdraw(-200);
		
		String statement = account.printStatement();
		
		String expected = Account.HEADER
						 +"29/12/2023 +500 500\n";
						
		assertEquals(expected,statement);
	}
	@Test
	public void testWithdrawWithInsufficientAmount()
	{
		Account account = new Account();
		account.deposit(100);
		account.withdraw(200);
		
		String statement = account.printStatement();
		
		String expected = Account.HEADER
						 +"29/12/2023 +100 100\n";
						
		assertEquals(expected,statement);
	}
}
