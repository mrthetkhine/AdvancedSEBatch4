package com.turing.advancedse4.tdd.kata.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Predicate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	Printer printer ;
	FizzBuzz fizzBuzz;
	
	@BeforeEach
	public void setUp()
	{
		printer = new MockPrinter();
		fizzBuzz = new FizzBuzz(printer);
	}
	@Test
	public void testNormalNumber()
	{
		String result = fizzBuzz.generate(1);
		assertEquals("1",result);
		
		result = fizzBuzz.generate(2);
		assertEquals("2",result);
	}
	@Test
	public void testNumberDivisibleByThree()
	{
		String result = fizzBuzz.generate(3);
		assertEquals(FizzBuzz.FIZZ,result);
		
	}
	@Test
	public void testNumberDivisibleByFive()
	{
		String result = fizzBuzz.generate(5);
		assertEquals(FizzBuzz.BUZZ,result);
		
		result = fizzBuzz.generate(10);
		assertEquals(FizzBuzz.BUZZ,result);
		
	}
	@Test
	public void testNumberDivisibleByBothThreeAndFive()
	{
		String result = fizzBuzz.generate(15);
		assertEquals("FizzBuzz",result);
		
	
	}
	/*
	@Test
	public void test1To100(){
	
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
	*/
	
}
