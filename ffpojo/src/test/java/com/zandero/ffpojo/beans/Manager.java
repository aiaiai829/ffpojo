package com.zandero.ffpojo.beans;

import java.util.HashSet;
import java.util.Set;

import com.zandero.ffpojo.metadata.positional.annotation.PositionalField;
import com.zandero.ffpojo.metadata.positional.annotation.PositionalRecord;
import com.zandero.ffpojo.metadata.positional.annotation.extra.SetPositionalField;

@PositionalRecord
public class Manager extends Employee{

	private String name;
	private String lastName;
	private Set<Employee> employees;

	@SetPositionalField(initialPosition=551, finalPosition=11580, itemType=Employee.class)
	public Set<Employee> getEmployees() {
		if (employees == null) employees =  new HashSet<Employee>();
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@PositionalField(initialPosition=1, finalPosition=10)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@PositionalField(initialPosition=11, finalPosition=30)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
