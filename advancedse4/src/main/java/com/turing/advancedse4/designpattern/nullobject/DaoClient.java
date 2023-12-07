package com.turing.advancedse4.designpattern.nullobject;

import java.util.Optional;

public class DaoClient {
	public static void main(String[]args)
	{
		DAO dao = new DAO();
		/*
		Employee emp = dao.getEmployeeById(-1);
		emp.work();
		*/
		Optional<Employee> result= dao.getById(1);
		Optional<String> name = result.map(emp->emp.name);
		if(name.isPresent())
		{
			System.out.println("Name "+name.get());
		}
	
	}
}
