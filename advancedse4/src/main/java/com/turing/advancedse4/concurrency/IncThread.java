package com.turing.advancedse4.concurrency;

class Data
{
	int value =0;
}
public class IncThread extends Thread {
	
	Data data ;
	IncThread(Data data)
	{
		this.data = data;
		
	}
	@Override
	public void run() {
		for(int i=0;i<100000;i++)
		{
			this.data.value++;
		}
		
	}
	public static void main(String[]args)
	{
		Data data = new Data();
		IncThread thread1 = new IncThread(data);
		IncThread thread2 = new IncThread(data);
		IncThread thread3 = new IncThread(data);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			
			System.out.println("Data "+data.value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
