package com.turing.advancedse4.designpattern.factorymethod;

public class FactoryMethod {
	public static void main(String[]args)
	{
		ConnectionFactory factory = new MySQLConnectionFactory();
		
		Connection conn = factory.getConnection();
		
		conn.open();
		conn.close();
	}
}
