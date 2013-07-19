package com.webonise.serveletdemo.model;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author webonise
 * the main employee class 
 *
 */
public class Department implements Serializable
{
	private String name ;
	private int id;
	
	
	/**
	 * @param name
	 * @param id
	
	 * parameterized constructor to set the value of the class with the default parameters
	 */
	public Department(String name, int id)
	{
		this.name=name;
		this.id=id;
	
		System.out.println("Department: returning from constructor");
	}
	/**
	 * default constructor
	 */
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return to return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @return to return the name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @param name .. sets the name of the employee
	 */
	public void setName(String name )
	{
		this.name=name;
	}
	/**
	 * @param name .. sets the age of the employee
	 */
	
	public void setId(int id)
	{
		this.id=id;
	}
	@Override
	public int hashCode() {
        return new HashCodeBuilder(1583,2179).append(name)
        		.append(id)
        			.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
        if ( obj == null )
                return false;
        if ( obj == this )
                return true;
        if ( obj.getClass() != getClass() )
                return false;
        Department rhs = (Department) obj;
        return new EqualsBuilder().append(name, rhs.name)
        		.append(id, rhs.id)
        	.isEquals();
    }
	
}
