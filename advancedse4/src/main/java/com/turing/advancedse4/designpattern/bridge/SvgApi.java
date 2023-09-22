package com.turing.advancedse4.designpattern.bridge;

public class SvgApi implements DrawingAPI{

	@Override
	public void drawCircle() {
		System.out.println("SVG Draw Circle");
		
	}

	@Override
	public void drawRectangle() {
		System.out.println("SVG Draw Rectangle");
		
	}

}
