package com.webonise.assignment.threadDemo;
class Chopstick 
{
   void call(String msg) 
   {
      System.out.println("[" + msg);
      try 
      {
         Thread.sleep(1000);
      } 
      catch (InterruptedException e) 
      {
         System.out.println("Interrupted");
      }
      System.out.println("]");
   }
}