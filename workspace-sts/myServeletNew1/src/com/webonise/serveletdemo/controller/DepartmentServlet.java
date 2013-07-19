package com.webonise.serveletdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;
import com.webonise.serveletdemo.model.Department;
import com.webonise.servletdemo.service.DepartmentService;
import com.webonise.servletdemo.service.DepartmentServiceInterface;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class DepartmentServlet extends HttpServlet {
	Department department,departmentData;
	DepartmentServiceInterface departmentService;
	
    /**
     * @see HttpServlet#HttpServlet()
     * calling the super class
     */
    public DepartmentServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * to respnd to the get request .. 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * all the operations that  are needed to be performed on the data received
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
			System.out.println("in the servlet");
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			
			String name=request.getParameter("name");
			int  id=Integer.parseInt(request.getParameter("id"));
			
			System.out.println("Department: do POST");
			out.println(name);
			out.println(id);
		
			
			department=getToDepartment(name, id);
			System.out.println("Department:Department object created");
			
			departmentService=new DepartmentService();
			try {
				departmentService.addIntoDepartment(department);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Department: DONE!");
			//getServletConfig().getServletContext().getRequestDispatcher("/AddDepatment.jsp").forward(request, response); 
			
			
			ArrayList<Department> departmentList=new ArrayList<Department>();
			departmentList=departmentService.getServiceDepartmentData();
			System.out.println("list received");
			
			request.setAttribute("result", departmentList);
		    request.getRequestDispatcher("DisplayDepartment.jsp").forward(request, response);  
			
	}

	/**
	 * @param name 
	 * @param id
	 * @param age
	 * @param dob
	 * @param dept_id
	 * function to set the value to the employee class
	 * @return
	 */
	private Department getToDepartment(String name, int id) 
	{
		System.out.println("Department: calling Department constructor");
		return new Department(name, id);
		
	}

}
