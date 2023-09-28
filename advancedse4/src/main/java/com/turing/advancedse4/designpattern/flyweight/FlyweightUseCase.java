package com.turing.advancedse4.designpattern.flyweight;

public class FlyweightUseCase {
	public static void main(String[]args)
	{
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println("Str1==str2 "+(str1==str2));	
		
		Integer a = 127;
		Integer b = 127;
		
		System.out.println("a==b "+(a==b));		
	}
}
