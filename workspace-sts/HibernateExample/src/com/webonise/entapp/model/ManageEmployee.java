package com.webonise.entapp.model;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageEmployee {
   private static SessionFactory factory; 

   
   
   
   public static void main(String[] args) {
	 
     try{
    	  System.out.println("hello");
         factory = new Configuration().configure().buildSessionFactory();
     }
     catch(Exception  e)
     {
    	 System.out.println("error in the factory");
     }
     // ManageEmployee ME = new ManageEmployee();
    
      System.out.println("hello");
      org.hibernate.classic.Session session = factory.openSession();
      Transaction tx=null;
     try
     { 
    	
      System.out.println("hello");
      tx = session.beginTransaction();
      
      		Employee employee= new Employee("rana","singh",17000);
      		session.save(employee); 
      		
      	
        
      tx.commit();
     }
     catch (HibernateException e) {
       if (tx!=null) tx.rollback();
       e.printStackTrace(); 
     }finally {
       session.close(); 
     }
     
     
      
     
      /* Add few employee records in database */
    //  Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
    //  Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
    //  Integer empID3 = ME.addEmployee("John", "Paul", 10000);

      /* List down all the employees */
    //  ME.listEmployees();

      /* Update employee's records */
     // ME.updateEmployee(empID1, 5000);

      /* Delete an employee from the database */
    //  ME.deleteEmployee(empID2);

      /* List down new list of the employees */
     // ME.listEmployees();
   }
   /* Method to CREATE an employee in the database */
   public Integer addEmployee(String fname, String lname, int salary){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      try{
         tx = session.beginTransaction();
         Employee employee = new Employee(fname, lname, salary);
         employeeID = (Integer) session.save(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return employeeID;
   }
   /* Method to  READ all the employees */
   public void listEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         List employees = session.createQuery("FROM Employee").list(); 
         for (Iterator iterator = 
                           employees.iterator(); iterator.hasNext();){
            Employee employee = (Employee) iterator.next(); 
            System.out.print("First Name: " + employee.getFirstName()); 
            System.out.print("  Last Name: " + employee.getLastName()); 
            System.out.println("  Salary: " + employee.getSalary()); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to UPDATE salary for an employee */
   public void updateEmployee(Integer EmployeeID, int salary ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Employee employee = 
                    (Employee)session.get(Employee.class, EmployeeID); 
         employee.setSalary( salary );
		 session.update(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to DELETE an employee from the records */
   public void deleteEmployee(Integer EmployeeID){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Employee employee = 
                   (Employee)session.get(Employee.class, EmployeeID); 
         session.delete(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
}