package com.webonise.assignment.hashmap;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;




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
	


	@Override
	public int hashCode() {
        return new HashCodeBuilder(1583,2179).append(id)
        		.append(name)
        			.append(college)
        				.append(age).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
        if ( obj == null )
                return false;
        if ( obj == this )
                return true;
        if ( obj.getClass() != getClass() )
                return false;
        Person rhs = (Person) obj;
        return new EqualsBuilder().append(id, rhs.id)
        		.append(name, rhs.name)
        		.append(college, rhs.college)
        		.append(age, rhs.age).isEquals();
    }


	
}
