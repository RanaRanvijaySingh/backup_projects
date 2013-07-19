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
@Table(name = "employee")
public class Employee implements Serializable
{
	@Column(name = "fname")
	private String name ;
	
	@Id @GeneratedValue
	   @Column(name = "id")
	private int id;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "dept_id")
	private int deptId;
	
	public Employee()
	{}
	
	public Employee(String name, int id, int age, String dob, int dept_id) 
	{
		this.name=name;
		this.age=age;
		this.deptId=dept_id;
		this.dob=dob;
		this.id=id;

	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int dept_id) {
		this.deptId = dept_id;
	}


	
	/**
	 * @param name
	 * @param id
	 * @param age
	 * @param dob
	 * @param dept_id
	 * parameterized constructor to set the value of the class with the default parameters
	 */
	/*public Employee(String name, int id, int age, String dob, int dept_id)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.dob=dob;
		this.dept_id=dept_id;
		System.out.println("EMPLOYEE: returning from constructor");
	}
	*//**
	 * default constructor
	 *//*
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	*//**
	 * @return to return the id
	 *//*
	public int getId()
	{
		return id;
	}
	*//**
	 * @return to return the name
	 *//*
	public String getName()
	{
		return name;
	}
	*//**
	 * @return to return the date of birth
	 *//*
	public String getDob()
	{
		return dob;
	}
	*//**
	 * @return to return the dept id 
	 *//*
	public int getDeptId()
	{
		return dept_id;
		
	}
	*//**
	 * @return to return the age
	 *//*
	public int getAge()
	{
		return age;
	}
	
	*//**
	 * @param name .. sets the name of the employee
	 *//*
	public void setName(String name )
	{
		this.name=name;
	}
	*//**
	 * @param name .. sets the age of the employee
	 *//*
	public void setAge(int age)
	{
		this.age=age;
	}
	*//**
	 * @param name .. sets the date of birth of the employee
	 *//*
	public void setDob(String dob)
	{
		this.dob=dob;
	}
	*//**
	 * @param name .. sets the dept id of the employee
	 *//*
	public void setDeptId(int dept_id)
	{
		this.dept_id=dept_id;
	}
	*//**
	 * @param name .. sets the id of the employee
	 *//*
	public void setId(int id)
	{
		this.id=id;
	}*/
	@Override
	public int hashCode() {
        return new HashCodeBuilder(1583,2179).append(name)
        		.append(id)
        			.append(age)
        				.append(dob)
        					.append(deptId).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
        if ( obj == null )
                return false;
        if ( obj == this )
                return true;
        if ( obj.getClass() != getClass() )
                return false;
        Employee rhs = (Employee) obj;
        return new EqualsBuilder().append(name, rhs.name)
        		.append(id, rhs.id)
        		.append(age, rhs.age)
        		.append(dob, rhs.dob)
        		.append(deptId, rhs.deptId).isEquals();
    }
	
}
