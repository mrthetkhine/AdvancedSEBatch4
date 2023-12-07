package com.turing.advancedse4.designpattern.nullobject;

import java.util.Optional;

class Employee
{
	String name;
	String id;
	
	Employee(String name, String id)
	{
		this.name = name;
		this.id = id;
	}
	void work()
	{
		System.out.println("Employee work");
	}
}
class EmptyEmployee extends Employee
{
	EmptyEmployee(String name, String id) {
		super(name, id);
	}

	void work()
	{
	}
}
public class DAO {

	Optional<Employee> getById(Integer id)
	{
		if(id==-1)
		{
			return Optional.empty();
		}
		else
		{
			return Optional.of(new Employee("Emp1","1120"));
			//return Optional.ofNullable(null);
		}
	}
	Employee getEmployeeById(Integer id)
	{
		if(id==-1)
		{
			return new EmptyEmployee("", "");
		}
		else
		{
			return new Employee("Emp1","1120");
		}
	}
}
