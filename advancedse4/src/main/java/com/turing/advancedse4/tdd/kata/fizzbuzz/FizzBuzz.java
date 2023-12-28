package com.turing.advancedse4.tdd.kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FizzBuzz {
	Printer printer;
	List<Predicate<Integer>> predicates ;
	List<String> data ;
	FizzBuzz(Printer printer)
	{
		this.printer = printer;
		this.predicates =new ArrayList<Predicate<Integer>>();
		this.data= new ArrayList<String>();
		
		this.predicates.add((i)->i%3==0&& i%6==0);
		this.data.add("FizzBuzz");
		
		this.predicates.add((i)->i%3==0);
		this.data.add("Fizz");
		
		this.predicates.add((i)->i%6==0);
		this.data.add("Buzz");
	}
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
	}
}
