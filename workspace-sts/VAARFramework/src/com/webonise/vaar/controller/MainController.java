package com.webonise.vaar.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.webonise.vaar.model.Student;
import com.webonise.vaar.service.VaarService;
import com.webonise.vaar.service.VaarServiceImpl;

public class MainController 
{
	

	   public static void main(String[] args) 
	   {
	    
		  System.out.println("started... ");
		   
		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      VaarService vaarService = (VaarServiceImpl) context.getBean("servicebean");

	      System.out.println("object created");
	     
	      vaarService.getService();
	      
	      
	   
	   }

}
