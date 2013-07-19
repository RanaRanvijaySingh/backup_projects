package com.webonise.assignment.threadDemo;

class Philosopher implements Runnable {
	   String name;
	   Chopstick rightStick;
	   Chopstick leftStick;
	   Thread t;
	   public Philosopher(Chopstick targ, String s) {
	      rightStick = targ;
	      name = s;
	      t = new Thread(this);
	      t.start();
	   }
	   
	   // synchronize calls to call()
	   public void run() {
	      synchronized(rightStick) { // synchronized block
	         rightStick.call(name);
	      }
	   }
	}