
package com.webonise.assignment.hashset;
import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
/**
 * @author Ranvijay
 * This class is used to demonstrate the function of the hashset
 * the iterator is used to access all the data stored in the hashset.
 */
public class HashsetDemo 
{
   public static void main(String args[])
   {     
	  String myString = new String("I come I see I read I go");
	  String word[] = myString.split(" ");
	  HashSet hs = new HashSet();
      for (int i = 0; i < word.length; i++) 
      {	
			if(!hs.contains(word[i]))
			{
				hs.add(word[i]);
			}
		}
	
		for (Iterator iterator = hs.iterator(); iterator.hasNext();) 
		{
			String h_word = (String) iterator.next();
			System.out.print(" "+h_word);
		}
      
   }
}