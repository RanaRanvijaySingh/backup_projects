package com.webonise.sevletdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import com.webonise.serveletdemo.model.Employee;
import com.mysql.*;

/**
 * @author webonise
 * main class to access the database 
 */
public class EmployeeImp implements EmployeeDoaInterface
{
	

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 
	private static final String url = "jdbc:mysql://localhost:3306/test";
 
    private static final String user = "root";
 
    private static final String password = "root";
    
    ArrayList<Employee> employeeList;
    
	/* (non-Javadoc)
	 * @see com.webonise.sevletdemo.dao.EmployeeDoaInterface#addEmployeeRow(com.webonise.serveletdemo.model.Employee)
	 *	function to add a row in the database of the table employee
	 */
	@Override
	public void addEmployeeRow(Employee employee) throws SQLException 
	{
		try {
			Class.forName (JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("establishing connection");
		
		Connection con = DriverManager.getConnection(url, user, password);   
    	
		Statement stat_EMP = (Statement) con.createStatement();
		
		System.out.println("connection made");
		
		String sql = "insert into employee values" +
				"(NULL,'" +
				employee.getName() +"',"+
				employee.getAge() +",'"+
				employee.getDob() +"',"+
				employee.getDeptId()+
				")";
		
   	 	stat_EMP.executeUpdate(sql);
   	 System.out.println("value inserted");
		
	}
	
	/* (non-Javadoc)
	 * @see com.webonise.sevletdemo.dao.EmployeeDoaInterface#fetchDaoEmployeeData()
	 *	function to fetch the data from the database back to the service class
	 */
	@Override
	public ArrayList<Employee> fetchDaoEmployeeData() throws SQLException 
	{
		employeeList= new ArrayList<Employee>();
		
		try {
			Class.forName (JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = DriverManager.getConnection(url, user, password);   
		System.out.println("EMPLOYEE: dao : fetching data");
		
		Statement stat_emp = (Statement) con.createStatement();
		String query_emp="SELECT * FROM employee";
		System.out.println("EMPLOYEE: dao : fetching data");
		
		ResultSet rs_emp=(ResultSet) stat_emp.executeQuery(query_emp);
		
		System.out.println("---------------------------------------------------");
        System.out.println("ID\tNAME\tAGE\tDOB\t\tDEPATRMENT");
        System.out.println("---------------------------------------------------");
        int i=0;
        while(rs_emp.next())
        {
        	
        	Employee employee = new Employee();
           //Retrieve by column name
           int id  = rs_emp.getInt("id");
           String name= rs_emp.getString("fname");
           int age = rs_emp.getInt("age");
           String dob=rs_emp.getString("dob");
           int dept_id = rs_emp.getInt("dept_id");
           
           employee.setName(name);
           employee.setAge(age);
           employee.setDob(dob);
           employee.setDeptId(dept_id);
           employee.setId(id);
           
           //Display values
           System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getAge()+"\t"+employee.getDob()+"\t"+employee.getDeptId());
          
           employeeList.add(employee);
          
        }
		return employeeList;	
		
	}
	
	

}
