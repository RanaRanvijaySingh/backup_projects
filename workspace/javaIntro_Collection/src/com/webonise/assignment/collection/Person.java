package com.webonise.assignment.collection;



/**
 * @author Ranvijay
 *this class contains the private and public data of a person object.
 */
public class Person {

	private int id;
	private String name;
	private String college;
	private int age;
	/**
	 * @param id 		:id of a person integer type
	 * @param name		:name of the person string type
	 * @param college	:college of the person string type 
	 * @param age		:age of the person integer type
	 */
	Person(int id,String name,String college,int age)
	{
		this.id=id;
		this.name=name;
		this.college=college;
		this.age=age;
	}
	Person(){}
	/**
	 * @return : returns the name of the person
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * @return 	:returns the id of the person 
	 */
	public int getId()
	{
		return this.id;
	}
	/**
	 * @return 	:returns the age of the person 
	 */
	public int getAge()
	{
		return this.age;
	}
	/**
	 * @return 	: returns the college of the person
	 */
	public String getCollege()
	{
		return this.college;
	}
	
}
