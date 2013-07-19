package com.webonise.assignment.reentrantlock;
import java.io.*;
import java.util.concurrent.locks.ReentrantLock;
public class ReentrantLockDemo 
{
	public static void main (String args[])throws IOException
	{
		
		Thread []thread=new Thread[4];
		ReentrantLock []lock=new ReentrantLock[2];
		DemoPrint demo[]=new DemoPrint[4];
		
		
		lock[0]=new ReentrantLock();
		lock[1]=new ReentrantLock();
		
		for(int i=0;i<4;i++)
			
		{
			String mesg="message"+i;
			
			
			if(i==0 || i==2)
			
				demo[i]=new DemoPrint(lock[0],mesg);
			else
				demo[i]=new DemoPrint(lock[1],mesg);
			
			thread[i]=new Thread(demo[i]);
			
			//System.out.println("init ");
			
		}
		try
		{
			for(int i =0;i<4;i++)
			{
				thread[i].start();
				//System.out.println("first thread init"+i);
				
				
			}
				
		}
		catch(Exception e)
		{
			System.out.println("there is an exception");
		}
	}

}