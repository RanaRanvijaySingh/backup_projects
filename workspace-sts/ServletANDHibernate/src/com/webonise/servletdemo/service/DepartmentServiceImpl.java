package com.webonise.servletdemo.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.webonise.serveletdemo.model.Department;
import com.webonise.sevletdemo.dao.DepartmentDoa;
import com.webonise.sevletdemo.dao.DepartmentImp;

public class DepartmentServiceImpl implements DepartmentService
{

	DepartmentDoa departmentDoa;
	
	/* (non-Javadoc)
	 * @see com.webonise.servletdemo.service.DepartmentServiceInterface#addIntoEmployee(com.webonise.serveletdemo.model.Employee)
	 *	 
	 */
	@Override
	public void addIntoDepartment(Department department) throws SQLException 
	{
			System.out.println("Department: service : into the employee");
			
			departmentDoa=new DepartmentImp();
			
			System.out.println("Department: service : into the Department");
			
			departmentDoa.addDepartmentRow(department);	
			
			System.out.println("Department: service : returning from the Department");
				
		
	}

	/* (non-Javadoc)
	 * @see com.webonise.servletdemo.service.DepartmentServiceInterface#getServiceDepartmentData()
	 *	function to featch the data back to the controller class
	 */
	@Override
	public ArrayList<Department> getServiceDepartmentData() 
	{
		ArrayList<Department> departmentList= new ArrayList<Department>();
		
			try {
				System.out.println("Department: service : fetching data");
				
				departmentList=departmentDoa.fetchDaoDepartmentData();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return departmentList;
	}

	
	

}
