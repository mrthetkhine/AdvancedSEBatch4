package com.turing.advancedse4.general;


public class RefSemantic2 {
	
	static void change(Data obj)
	{
		//obj.data ++;
		obj = new Data(100);
	}
	public static void main(String[]args)
	{
		Data data = new Data(10);
		change(data);
		
		System.out.println("Data "+data.data);
	}
}
