package com.webonise.sevletdemo.dao;

//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
//import org.hibernate.cfg.AnnotationConfiguration;

import com.webonise.serveletdemo.model.Employee;
//import com.mysql.*;

/**
 * @author webonise
 * main class to access the database 
 */
public class EmployeeImp implements EmployeeDoa
{
    
    ArrayList<Employee> employeeList;
    
    private static SessionFactory factory; 
	/* 	(non-Javadoc)
	 * 	@see com.webonise.sevletdemo.dao.EmployeeDoaInterface#addEmployeeRow(com.webonise.serveletdemo.model.Employee)
	 *	function to add a row in the database of the table employee
	 */
	@Override
	public void addEmployeeRow(Employee employee) throws SQLException 
	{ 

  	  System.out.println("in the addEmployeeRow");
		
		      try
		      {
		    	 AnnotationConfiguration anno= new AnnotationConfiguration().addResource("hibernate.cfg.xml").configure() .addAnnotatedClass(com.webonise.serveletdemo.model.Employee.class);
		         System.out.println("creting factory ");
		    	 factory = anno.buildSessionFactory();
		         
		      }catch (Throwable ex) { 
		         System.out.println("Failed to create sessionFactory object." + ex);
		         throw new ExceptionInInitializerError(ex); 
		      }
		     
		     
		      Session session = factory.openSession();
		      Transaction tx = null;

	    	  System.out.println("initilizing transaction");
		      try
		      {
		         tx = session.beginTransaction();

		    	 System.out.println("adding to employee");
		       //  Employee employee1 = new Employee("rana",11,23,"1989-11-5",4);
		       

		    	 System.out.println("saving to employee");
		         session.save(employee); 

		    	  System.out.println("saved in employee");
		         tx.commit();
		      }
		      catch (HibernateException e) 
		      {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }
		      finally 
		      {
		         session.close(); 
		      }
	}
	
	
	/* (non-Javadoc)
	 * @see com.webonise.sevletdemo.dao.EmployeeDoaInterface#fetchDaoEmployeeData()
	 *	function to fetch the data from the database back to the service class
	 */
	@Override
	public ArrayList<Employee> fetchDaoEmployeeData() throws SQLException 
	{
		employeeList= new ArrayList<Employee>();
		
		Session session = factory.openSession();
	      Transaction tx = null;
	      System.out.println("reached to the display");
	      try{
	         tx = session.beginTransaction();
	         System.out.println("begin transaction ");
		      
	         List employees = session.createQuery("FROM Employee").list(); 
	         System.out.println("query created");
		      
	         for (Iterator iterator = employees.iterator(); iterator.hasNext();)
	         {
	            Employee employee = (Employee) iterator.next(); 
	            System.out.print("Id: " + employee.getId()); 
	            System.out.print("Name: " + employee.getName()); 
	            System.out.print("DOB: " + employee.getDob()); 
	            System.out.print("Age: " + employee.getAge()); 
	            System.out.println("Department: " + employee.getDeptId()); 
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      } 
	      //employeeList.add(employee);
          
        
		
	return employeeList;	
		
	}
	
	

}
