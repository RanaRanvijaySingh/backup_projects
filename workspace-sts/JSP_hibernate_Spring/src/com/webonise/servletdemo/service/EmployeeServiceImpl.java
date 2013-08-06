package com.webonise.servletdemo.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.webonise.serveletdemo.model.Employee;
import com.webonise.sevletdemo.dao.EmployeeDoa;
import com.webonise.sevletdemo.dao.EmployeeImp;

public class EmployeeServiceImpl implements EmployeeService
{

	EmployeeDoa employeeDoa;
	
	/* (non-Javadoc)
	 * @see com.webonise.servletdemo.service.EmployeeServiceInterface#addIntoEmployee(com.webonise.serveletdemo.model.Employee)
	 *	 
	 */
	@Override
	public void addIntoEmployee(Employee employee) throws SQLException 
	{
			System.out.println("EMPLOYEE: service : into the employee");
			
			employeeDoa=new EmployeeImp();
			
			System.out.println("EMPLOYEE: service : into the employee");
			
			employeeDoa.addEmployeeRow(employee);	
			
			System.out.println("EMPLOYEE: service : returning from the employee");
				
		
	}

	/* (non-Javadoc)
	 * @see com.webonise.servletdemo.service.EmployeeServiceInterface#getServiceEmployeeData()
	 *	function to featch the data back to the controller class
	 */
	@Override
	public ArrayList<Employee> getServiceEmployeeData() 
	{
		ArrayList<Employee> employeeList= new ArrayList<Employee>();
		
			try {
				System.out.println("EMPLOYEE: service : fetching data");
				
				employeeList=employeeDoa.fetchDaoEmployeeData();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return employeeList;
	}

	
	

}
