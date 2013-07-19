package com.webonise.assignment.collection;


import java.util.*;

/**
 * @author RANVIJAY
 	This class demonstrate the use and function arraylist .
 	the functions are called to show the way to add objects to the list.
 */
public class ArrayListDemo {
   public static void main(String args[]) {
     
      List <Person> personList = new ArrayList<Person>();
      
      
      Person rana=new Person(1, "rana", "bvbcet", 22);
      Person anvay=new Person(2, "anvay", "singadh", 22);
      Person vijay=new Person(3, "vijay", "mit", 22);
      Person ameya=new Person(4, "ameya", "vtu", 28);
      Person bhuvan=new Person(5, "bhuvan", "bvbcet", 36);
      
      
      personList.add(rana);
      personList.add(anvay);
      personList.add(vijay);
      personList.add(ameya);
      personList.add(bhuvan);
      
      Iterator<Person> myIterator = personList.iterator();
      System.out.println("ID\tNAME\tCOLLEGE\tAGE");
    	
      while(myIterator.hasNext()) 
      {
          Person person=myIterator.next();
          System.out.println(person.getId()+"\t"+person.getName()+"\t"+person.getCollege()+"\t"+person.getAge());

      }
      
      //demonstration of removal function
      System.out.println("\n\nsize of arraylist is before removal : "+personList.size());
      for(int i=0;i<personList.size();i++)
      {
      		personList.remove(i);
    	    	  
      }
      System.out.println("size of arraylist is after removal : "+personList.size());
      
      
      
      
   }
   
}