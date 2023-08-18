package com.turing.advancedse4.solid;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atMost;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CarTest extends Engine{

	boolean engineStarted = false;
	void start()
	{
		System.out.println("MOCK ENGINE START");
		this.engineStarted = true;
	}
	/*
	@Test
	public void testMethodCallAtMost()
	{
		Engine engine = Mockito.mock(Engine.class);
		Car car = new Car(engine);
		
		car.start();
		
		Mockito.verify(engine).start();
	}
	*/
	@Test 
	public void testCar()
	{
		Car car = new Car(this);
		car.start();
		
		assertEquals(true, this.engineStarted);
	}
}
