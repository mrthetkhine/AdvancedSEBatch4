package com.turing.advancedse4.designpattern.bridge;

public abstract class Shape {
	   DrawingAPI api;
	   
	   Shape(DrawingAPI api)
	   {
	       this.api = api;
	   }
	   abstract void draw();
}
