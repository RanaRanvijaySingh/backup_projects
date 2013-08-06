package com.webonise.entapp.controller;



import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webonise.entapp.model.HelloWorld;

public class MainApp 
{
	
   public static void main(String[] args) 
   {
    
	  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld2");

      obj.getMessage();
   
   }
}

