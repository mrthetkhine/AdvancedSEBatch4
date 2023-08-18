package com.turing.advancedse4.solid;

public class Car {
	Engine engine;
	Car(Engine engine)
	{
		this.engine = engine;
	}
	void start()
	{
		System.out.println("Car start");
		this.engine.start();
	}
	
}
