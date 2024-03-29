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



/*import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
*/
import com.mysql.jdbc.Statement;
//import com.webonise.entapp.model.HelloWorld;
import com.webonise.serveletdemo.model.Employee;
import com.webonise.servletdemo.service.EmployeeService;
import com.webonise.servletdemo.service.EmployeeServiceImpl;


import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class EmployeeServlet extends HttpServlet {
	Employee employee,employeeData;
	EmployeeService employeeService;
	ApplicationContext context;
	
    /**
     * @see HttpServlet#HttpServlet()
     * calling the super class
     */
    public EmployeeServlet() 
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
			int  age=Integer.parseInt(request.getParameter("age"));
			String dob=request.getParameter("dob");
			int  dept_id=Integer.parseInt(request.getParameter("dept_id"));
			
			System.out.println("EMPLOYEE: do POST");
			out.println(name);
			out.println(id);
			out.println(age);
			out.println(dob);
			out.println(dept_id);
			
			employee=getToEmployee(name, id, age,dob,dept_id);
			System.out.println("EMPLOYEE: employee object created");
			
			/*employeeService=new EmployeeServiceImpl();
			System.out.println("EMPLOYEE: SERVLET : back ");
			try {
				employeeService.addIntoEmployee(employee);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("EMPLOYEE: DONE!");
			//getServletConfig().getServletContext().getRequestDispatcher("/AddDepatment.jsp").forward(request, response); 
			
			
			ArrayList<Employee> employeeList=new ArrayList<Employee>();
			employeeList=employeeService.getServiceEmployeeData();
			System.out.println("list received");
			
			request.setAttribute("result", employeeList);
		    request.getRequestDispatcher("DisplayEmployee.jsp").forward(request, response);  
		    
		    
		    */
			
	}

	
	
	private Employee getToEmployee(String name, int id, int age, String dob,int dept_id) 
	{
		
		
			context = new ClassPathXmlApplicationContext("Beans.xml");

			Employee employeebean  = (Employee) context.getBean("employeebean");
	      
			System.out.println(employeebean.getAge());
			
			System.out.println("EMPLOYEE: calling employee constructor");
			
			return employeebean;
		
	}

}
