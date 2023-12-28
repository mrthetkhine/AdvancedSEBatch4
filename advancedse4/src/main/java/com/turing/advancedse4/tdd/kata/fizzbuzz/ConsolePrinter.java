package com.turing.advancedse4.tdd.kata.fizzbuzz;

public class ConsolePrinter implements Printer {

	@Override
	public void print(String message) {
		
		System.out.print(message);
	}

}
