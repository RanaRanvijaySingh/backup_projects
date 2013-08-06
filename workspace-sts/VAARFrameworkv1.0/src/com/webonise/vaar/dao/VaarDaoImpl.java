package com.webonise.vaar.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import com.webonise.vaar.model.Student;




public class VaarDaoImpl implements VaarDao
{
	private static SessionFactory factory; 
	

	public void dbOperation() 
	{		
		System.out.println("in the dao .. JDBC operations");
		
		  try
	      {
	    	 AnnotationConfiguration anno= new AnnotationConfiguration().addResource("hibernate.cfg.xml").configure() .addAnnotatedClass(com.webonise.vaar.model.Student.class);
	         System.out.println("creting factory ");
	    	 factory = anno.buildSessionFactory();
	         
	      }
	      catch (Throwable ex) 
	      { 
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
	         Student stud= new Student("rana",44);
	       

	    	 System.out.println("saving to employee");
	         session.save(stud); 

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

}
