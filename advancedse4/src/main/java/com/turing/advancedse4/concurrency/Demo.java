package com.turing.advancedse4.concurrency;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[]args)
	{
		List<Integer> data = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			data.add(i);
		}
		data.removeIf(item-> item %2!=0);
		
		System.out.println("Data "+data.size());
	}
}
