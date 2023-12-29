package com.turing.advancedse4.tdd.kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FizzBuzz {
	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";
	Printer printer;
	List<Predicate<Integer>> predicates ;
	List<String> data ;
	FizzBuzz(Printer printer)
	{
		this.printer = printer;
		this.predicates =new ArrayList<Predicate<Integer>>();
		this.data= new ArrayList<String>();
		
		this.predicates.add((i)->i%3==0&& i%5==0);
		this.data.add("FizzBuzz");
		
		this.predicates.add((i)->i%3==0);
		this.data.add(FIZZ);
		
		this.predicates.add((i)->i%5==0);
		this.data.add(BUZZ);
	}
	String generate(int number)
	{
		
		boolean matchPredicate = false;
		int index = -1;
		for(int j=0;j<this.predicates.size();j++)
		{
			Predicate<Integer> predicate = this.predicates.get(j);
			if(predicate.test(number))
			{
				matchPredicate = true;
				index =j;
				break;
			}
		}
		if(matchPredicate)
		{
			return data.get(index);
		}
		else
		{
			return number+"";
		}
	}
	/*
	void generate()
	{
		for(int i=1;i<=100;i++)
		{
			boolean matchPredicate = false;
			int index = -1;
			for(int j=0;j<this.predicates.size();j++)
			{
				Predicate<Integer> predicate = this.predicates.get(j);
				if(predicate.test(i))
				{
					matchPredicate = true;
					index =j;
					break;
				}
			}
			if(matchPredicate)
			{
				this.printer.print(data.get(index)+"\n");
			}
			else
			{
				this.printer.print(i+"\n");
			}
		}
	}*/
}
