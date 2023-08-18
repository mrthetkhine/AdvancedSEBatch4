package com.turing.advancedse4.solid;

public class Engine {
	void start()
	{
		System.out.println("Engine start");
	}
}
class DieselEngine extends Engine
{
	void start()
	{
		System.out.println("DieselEngine start");
	}
}