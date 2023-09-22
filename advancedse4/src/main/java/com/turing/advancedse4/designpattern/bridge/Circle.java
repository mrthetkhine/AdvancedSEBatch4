package com.turing.advancedse4.designpattern.bridge;

public class Circle extends Shape{

	public Circle(DrawingAPI api)
	{
		super(api);
	}
	@Override
	public void draw() {
		this.api.drawCircle();
	}

}
