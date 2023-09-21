package com.turing.advancedse4.designpattern.adapter;

public class ObjectAdapter implements NewApi{
	LegacyClass legacy = new LegacyClass();

	@Override
	public void add() {
		legacy.push();
	}
	public static void main(String[]args)
	{
		NewApi api = new ObjectAdapter();
		api.add();
	}
}
