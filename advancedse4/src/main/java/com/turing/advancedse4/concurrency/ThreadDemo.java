package com.turing.advancedse4.concurrency;

public class ThreadDemo extends Thread{

	String name;
	ThreadDemo(String name)
	{
		this.name = name;
		
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++)
		{
			System.out.println("Thread "+name+" i=> "+i);
		}
		
	}
	public static void main(String[]args)
	{
		ThreadDemo thread1 = new ThreadDemo("Thread1");
		ThreadDemo thread2 = new ThreadDemo("Thread2");
		ThreadDemo thread3 = new ThreadDemo("Thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
