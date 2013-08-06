package com.webonise.vaar.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webonise.vaar.service.VaarService;
import com.webonise.vaar.service.VaarServiceImpl;

/**
 * Servlet implementation class MainServlet
 */

public class MainServlet extends HttpServlet {
	
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -2616718829083761322L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		System.out.println("in the servlet.. ");
		
		response.setContentType("text/html");
		String page=request.getParameter("name");
		
		System.out.println("Your name is going in records:" +page);
		
		 System.out.println("started... ");
		   
//		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
//	      VaarService vaarService = (VaarServiceImpl) context.getBean("servicebean");

	      System.out.println("object created");
	     
//	      vaarService.getService();
	
	}

}
