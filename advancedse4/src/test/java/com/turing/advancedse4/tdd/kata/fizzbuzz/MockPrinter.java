package com.turing.advancedse4.tdd.kata.fizzbuzz;

public class MockPrinter implements Printer{

	StringBuffer buffer =new StringBuffer();
	
	@Override
	public void print(String message) {
		buffer.append(message);
		
	}
	public String toString()
	{
		return this.buffer.toString();
	}

}
