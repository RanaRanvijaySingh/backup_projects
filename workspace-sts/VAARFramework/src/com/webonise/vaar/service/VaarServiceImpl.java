package com.webonise.vaar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webonise.vaar.dao.VaarDao;
import com.webonise.vaar.dao.VaarDaoImpl;

public class VaarServiceImpl implements VaarService
{
	@Autowired
	private VaarDao vaarDao;

	public void getService() 
	{
		
		System.out.println("in the service class");
		vaarDao.dbOperation();
		
	}

		
	
	

}
