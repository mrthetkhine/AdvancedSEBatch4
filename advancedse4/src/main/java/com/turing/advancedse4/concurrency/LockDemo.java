package com.turing.advancedse4.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Value
{
	int value =0;
	
}
class MyThread extends Thread {
	
	Value data ;
	Lock lock;
	MyThread(Value data,Lock lock)
	{
		this.data = data;
		this.lock = lock;
		
	}
	@Override
	public void run() {
		for(int i=0;i<100000;i++)
		{
		
			this.lock.lock();
			this.data.value++;
			this.lock.unlock();
		}
		
	}
	
}
public class LockDemo
{
	public static void main(String[]args)
	{
		Value data = new Value();
		Lock lock = new ReentrantLock();
		MyThread thread1 = new MyThread(data,lock);
		MyThread thread2 = new MyThread(data,lock);
		MyThread thread3 = new MyThread(data,lock);
		
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
