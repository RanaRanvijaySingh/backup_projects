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

import com.webonise.serveletdemo.model.Department;
//import com.mysql.*;

/**
 * @author webonise
 * main class to access the database 
 */
public class DepartmentImp implements DepartmentDoa
{
    
    ArrayList<Department> departmentList;
    
    private static SessionFactory factory; 
	/* 	(non-Javadoc)
	 * 	@see com.webonise.sevletdemo.dao.EmployeeDoaInterface#addEmployeeRow(com.webonise.serveletdemo.model.Employee)
	 *	function to add a row in the database of the table employee
	 */
	@Override
	public void addDepartmentRow(Department department) throws SQLException 
	{ 

  	  System.out.println("in the addDepartmentRow");
		
		      try
		      {
		    	 AnnotationConfiguration anno= new AnnotationConfiguration().addResource("hibernate.cfg.xml").configure() .addAnnotatedClass(com.webonise.serveletdemo.model.Department.class);
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

		    	 System.out.println("adding to depertment");
		       //  Employee employee1 = new Employee("rana",11,23,"1989-11-5",4);
		       

		    	 System.out.println("saving to department");
		         session.save(department); 

		    	  System.out.println("saved in department");
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
	public ArrayList<Department> fetchDaoDepartmentData() throws SQLException 
	{
		departmentList= new ArrayList<Department>();
		
		Session session = factory.openSession();
	      Transaction tx = null;
	      System.out.println("reached to the display");
	      try
	      {
	         tx = session.beginTransaction();
	         System.out.println("begin transaction ");
		   
	        
	         List departments = session.createQuery(" FROM Department ").list(); 

	         System.out.println("--------------------------------");
	         System.out.println("ID\tNAME");
	         System.out.println("--------------------------------");
		      
	         for (Iterator iterator = departments.iterator(); iterator.hasNext();)
	         {
	        	 Department department = (Department) iterator.next(); 
	            System.out.println(department.getId()+"\t"+
	            		department.getName()); 
	            
	            departmentList.add(department);
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      } 
	      //employeeList.add(employee);
          
        
		
	return departmentList;	
		
	}
	
	

}
