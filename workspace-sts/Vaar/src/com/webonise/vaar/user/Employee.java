/**
 * 
 */
package com.webonise.vaar.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.webonise.vaar.annotationinterface.GridColumn;
import com.webonise.vaar.annotationinterface.SearchColumn;

/**
 * @author Vijayraj Nathe class is a set of employee details.
 */
@Entity
@Table(name="employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 3436813059424263524L;
	
	@Id
	@GeneratedValue
	@Column(name="id")
	@SearchColumn(type = "Long", label = "Id")
	@GridColumn
	private int id;
	
	
	@Column(name="name")
	@SearchColumn(label = "Name", type = "String")
	@GridColumn
	private String name;
	
	
	@Column(name="did")
	@GridColumn
	private int department;
	
	
	@Column(name="dob")
	@SearchColumn(label = "Date", type = "Date")
	@GridColumn
	private String date;

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

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		Employee empl = (Employee) obj;
		return id == empl.id
				&& (name == empl.name || (name != null && name.equals(empl
						.getName())))
				&& (department == empl.getDepartment() && (date
						.equals(empl.date)));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + id;
		result = prime * result + ((department == 0) ? 0 : department);
		;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}

}
