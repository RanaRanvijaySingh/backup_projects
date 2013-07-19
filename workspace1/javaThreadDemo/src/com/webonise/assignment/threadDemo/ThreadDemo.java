package com.webonise.assignment.threadDemo;

public class ThreadDemo 
{
   public static void main(String args[]) 
   {
	   Chopstick chopstick[] = new Chopstick[5];
	   for(int i=0;i<5;i++)
	   {
		   chopstick[i]=new Chopstick();
	   }
	
	   Philosopher philosopher1 = new Philosopher(chopstick[0], "philosopher 1");
	   Philosopher philosopher2 = new Philosopher(chopstick[1], "philosopher 2");
	   Philosopher philosopher3 = new Philosopher(chopstick[2], "philosopher 3"); 
	   Philosopher philosopher4 = new Philosopher(chopstick[3], "philosopher 4");
	   Philosopher philosopher5 = new Philosopher(chopstick[4], "philosopher 5");
   
      // wait for threads to end
      try 
      {
    	  philosopher1.t.join();
    	  philosopher2.t.join();
    	  philosopher4.t.join();
    	  philosopher5.t.join();
    	  philosopher3.t.join();
      } 
      catch(InterruptedException e) 
      {
         System.out.println("Interrupted");
      }
   }
}