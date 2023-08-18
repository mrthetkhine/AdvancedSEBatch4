package com.turing.advancedse4.solid;

public class CarClient {
	public static void main(String[]args)
	{
		Engine engine = new DieselEngine();
		Car car = new Car(engine);
		car.start();
	}
}
