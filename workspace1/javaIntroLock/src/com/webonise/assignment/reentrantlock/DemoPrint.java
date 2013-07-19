package com.webonise.assignment.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoPrint implements Runnable
{
	String hello=null;
	Lock lock;
	DemoPrint(Lock lock,String msg)
	{
		this.lock=lock;
		hello=msg;
	}
	void displayMessage()
	{
		try{
			System.out.println(hello +" ki haal hai... oye!! ");
		
			Thread.sleep(1000);
			//System.out.println(this.hello+" ");
		
			}catch(Exception e)
			{
				System.out.println("there is an exception");
			}
		
	}
	private void releaseLock() {
		// TODO Auto-generated method stub
		System.out.println("released lock for: "+hello);
		lock.unlock();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		//System.out.println("in run " + hello);
		while(true)
		{
			waitIN();
			applyLock();
			displayMessage();
			releaseLock();
	
		}
	}
	
	private void waitIN() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void applyLock() {
		// TODO Auto-generated method stub
		System.out.println("lock on: "+hello);
		lock.lock();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}