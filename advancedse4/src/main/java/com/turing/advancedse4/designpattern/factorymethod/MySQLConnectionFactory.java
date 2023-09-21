package com.turing.advancedse4.designpattern.factorymethod;

public class MySQLConnectionFactory extends ConnectionFactory{

	@Override
	Connection getConnection() {
		return new MySQLConnection();
	}

}
