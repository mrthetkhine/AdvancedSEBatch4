package com.turing.advancedse4.general;

class Data
{
	int data;
	
	Data(int val)
	{
		this.data = val;
	}
}
public class RefSemantic {
	public static void main(String[]args)
	{
		Data objA = new Data(10);
		Data objB = objA;
		objA.data ++;
		
		System.out.println("ObjA.data "+objA.data);
		System.out.println("ObjB.data "+objB.data);
		
		objB = new Data(15);
		objB.data++;
		
		System.out.println("ObjA.data "+objA.data);
		System.out.println("ObjB.data "+objB.data);
		
		objB = null;
		System.out.println("ObjA.data "+objA.data);
		System.out.println("ObjB.data "+objB.data);
	}
}
