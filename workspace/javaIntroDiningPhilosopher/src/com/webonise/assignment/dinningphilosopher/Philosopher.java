package com.webonise.assignment.dinningphilosopher;

import java.util.concurrent.locks.Lock;

/**
 * @author Ranvijay
 * philosopher class is for performing all the functions like
 * thinking eating and waiting 
 *
 */
public class Philosopher implements Runnable 
{
	private String name;
	private int id;
	Lock leftChopstick;
	Lock rightChopstick;
		
	/**
	 * @param id		id of the philosopher
	 * @param name		name of the philosopher
	 * @param rightStick	right chopstick 
	 * @param leftStick		left chopstick
	 */
	Philosopher(int id,String name,Lock rightStick, Lock leftStick)
	{
		this.id=id;
		this.name=name;
		this.leftChopstick=leftStick;
		this.rightChopstick=rightStick;
	}
	
	/**
	 * first method called by the thread 
	 * executes all the operation of the person
	 */
	public void run() 
	{
		while (true) 
		{
			this.isThinking();
			//System.out.println("back from thinking");
			
			this.pickUpLeftStick();
			
			this.pickUpRightStick();
			this.isEating();
			
			putDownChopsticks();
		}
	}


	/** 
	 * Locks the right stick
	 */
	private void pickUpRightStick() 
	{
		rightChopstick.lock();
		System.out.println("Philosopher " + id + " : right stick");
	}

	/** 
	 * locks the left stick 
	 */
	private void pickUpLeftStick() 
	{
		leftChopstick.lock();
		System.out.println("Philosopher " + id + " : left stick");
		
	}
	
	/**
	 * wait time for the 
	 */
	private void isThinking()
	{
		System.out.println("Philosopher " + id + " is thinking.");
		
		try {
			Thread.sleep (2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * to unlock the chopstick 
	 */
	private void putDownChopsticks() 
	{
		leftChopstick.unlock();
		rightChopstick.unlock();
	}

	private void isEating() 
	{
		System.out.println("philosopher " + id + " is eating.");
		
		try {
			Thread.sleep (2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	



}