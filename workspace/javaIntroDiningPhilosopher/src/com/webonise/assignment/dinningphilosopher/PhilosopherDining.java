package com.webonise.assignment.dinningphilosopher;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Ranvijay
 * this is the main philosopher class 
 * that contains the philosopher objects and the 
 * the 5 lock that represent the chopsticks 
 *
 */
public class PhilosopherDining 
{

	

	/**
	 * the constructor to initialize 5 objects of the philosopher class 
	 *having 5 threads representing all 5 philosopher
	 *joining all the threads 
	 *calling all the start function to start the class
	 */
	PhilosopherDining()
	{
		Lock[] chopstick = new ReentrantLock[5];
		for (int i = 0; i < 5; i++) {
			chopstick[i] = new ReentrantLock();
		}
		
		
		
		Philosopher rana=new Philosopher(1,"PHILOSOPHER 1",chopstick[1],chopstick[0]);
		Philosopher anvay=new Philosopher(2,"PHILOSOPHER 2",chopstick[2],chopstick[1]);
		Philosopher vijay=new Philosopher(3,"PHILOSOPHER 3",chopstick[3],chopstick[2]);
		Philosopher ameya=new Philosopher(4,"PHILOSOPHER 4",chopstick[4],chopstick[3]);
		Philosopher bhuvan=new Philosopher(5,"PHILOSOPHER 5",chopstick[0],chopstick[4]);
		
		Thread thread_rana=new Thread(rana);
		Thread thread_anvay=new Thread(anvay);
		Thread thread_vijay=new Thread(vijay);
		Thread thread_ameya=new Thread(ameya);
		Thread thread_bhuvan=new Thread(bhuvan);
		
		try 
	      {
			thread_rana.join();
			thread_anvay.join();
			thread_vijay.join();
			thread_ameya.join();
			thread_bhuvan.join();
	      } 
	      catch(InterruptedException e) 
	      {
	         System.out.println("Interrupted");
	      }
		
		thread_rana.start();
		thread_anvay.start();
		thread_vijay.start();
		thread_ameya.start();
		thread_bhuvan.start();
		
		
		
		
	}
	/**
	 * this the main class to initialize the object of the PhilosopherDining class
	 * @param args
	 */
	public static void main (String args[])
	{
		PhilosopherDining init=new PhilosopherDining();
	}
}
