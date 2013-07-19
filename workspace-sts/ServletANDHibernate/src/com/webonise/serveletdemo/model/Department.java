package com.webonise.serveletdemo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author webonise
 * the main employee class 
 *
 */
@Entity
@Table(name = "department")
public class Department implements Serializable
{
	@Id @GeneratedValue
	   @Column(name = "id")
	private int id;
	@Column(name = "dept_name")
	private String name ;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
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
