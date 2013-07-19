package com.webonise.assignment.hashmap;
import java.util.*;

import com.webonise.assignment.hashmap.Person;

/**
 * @author Ranvijay
 * This class demonstrate the function and the use of hashmap
 * mapping is done for the record of 5 person , which are stored in the hashmap
 */
class HashMapDemo 
{
	public static void main(String args[]) 
	{
		  Person rana=new Person(1, "rana", "bvbcet", 22);
	      Person anvay=new Person(2, "anvay", "singadh", 22);
	      Person vijay=new Person(3, "vijay", "mit", 22);
	      Person ameya=new Person(4, "ameya", "vtu", 28);
	      Person bhuvan=new Person(5, "bhuvan", "bvbcet", 36);
		  
	      HashMap<String, Person> map = new HashMap<String, Person>();
		
	      map.put("rana",rana);
	      map.put("anvay",anvay);
	      map.put("vijay",vijay);
	      map.put("ameya",ameya);
	      map.put("bhuvan",bhuvan);
	
	      //using direct the value of the key 
	      String key=("ameya");
	      Person person = map.get(key);
	      System.out.println("key :" + key +"\t"+ person.getId()+"\t"+person.getName()+"\t"+person.getCollege()+"\t"+person.getAge());
	      System.out.println();
	      
	      
	      
	      
//the next part of the code was just for practice  new functions....................	    		  
	      //using iteration to fetch the value .. .. .
	      Iterator<String> keySetIterator = map.keySet().iterator();
	      while(keySetIterator.hasNext()){
	        String key1 = keySetIterator.next();
	        System.out.println("key :" + key1 +"\t"+ person.getId()+"\t"+person.getName()+"\t"+person.getCollege()+"\t"+person.getAge());
	      }
	      
	      //find the size fo the map 
	      System.out.println("\nSize of Map: " + map.size());
	      
	      
	      //use of the isEmpty funciton
	      if(!map.isEmpty())
	      {
	    	  System.out.println("\nthe map is not empty the value with key value \"rana\" is :");
	    	  String key2=("rana");
		      Person person2 = map.get(key);
		      System.out.println("key :" + key2 +"\t"+ person2.getId()+"\t"+person2.getName()+"\t"+person2.getCollege()+"\t"+person2.getAge());
		      System.out.println();
	      }
	      else
	      {
	    	  	System.out.println("\nthe map is empty");
	      }
	      
	      //to remove any value with the reference of the key value is 
	      String  key3 = ("rana");
	      Person person3 = map.remove(key3);
	      System.out.println("\nthe removed key value is :");
	      System.out.println("key :" + key3 +"\t"+ person3.getId()+"\t"+person3.getName()+"\t"+person3.getCollege()+"\t"+person3.getAge());
	      
	      
	     
	     

	 

	      
	}
	
}
