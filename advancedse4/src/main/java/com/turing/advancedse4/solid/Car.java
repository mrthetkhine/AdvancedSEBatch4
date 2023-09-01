package com.turing.advancedse4.solid;

public class Car {
	Engine engine;
	public Car(Engine engine)
	{
		this.engine = engine;
	}
	public void start()
	{
		System.out.println("Car start");
		this.engine.start();
	}
	
}
