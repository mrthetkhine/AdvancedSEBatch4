package com.turing.advancedse4.designpattern.adapter;

public class ClassAdapter extends LegacyClass implements NewApi {

	@Override
	public void add() {
		super.push();
	}
	public static void main(String[]args)
	{
		NewApi api = new ClassAdapter();
		api.add();
	}
}
