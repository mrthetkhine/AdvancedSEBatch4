package com.turing.advancedse4.tdd.kata.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	@Test
	public void test1To100(){
		//Printer printer = new ConsolePrinter();
		Printer printer = new MockPrinter();
		FizzBuzz fizzBuzz = new FizzBuzz(printer);
		fizzBuzz.generate();
		
		String expected = "";
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%6==0)
			{
				expected += "FizzBuzz"+"\n";
			}
			else if(i%3==0)
			{
				expected += "Fizz"+"\n";
			}
			else if(i%6==0)
			{
				expected += "Buzz"+"\n";
			}
			else
			{
				expected += i+"\n";
			}
			
		}
		System.out.println(expected);
		System.out.println(printer.toString());
		assertEquals(expected, printer.toString());
		
		Predicate<Integer> isDivisbleByBoth3AndSix= i -> i%3==0 && i%6==0;
		System.out.println(isDivisbleByBoth3AndSix.test(3));
		System.out.println(isDivisbleByBoth3AndSix.test(6));
	}
	
}
