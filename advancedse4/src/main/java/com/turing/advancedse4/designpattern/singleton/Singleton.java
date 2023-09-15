package com.turing.advancedse4.designpattern.singleton;

public class Singleton {

	private static Singleton instance;
	
	private String instanceOne="Hello";
	private Singleton()
	{
		System.out.println("Singleton created");
	}
	public synchronized static Singleton getSingleton()
	{		
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
	public void api()
	{
		System.out.println("Singleton API "+instanceOne);
	}
}
