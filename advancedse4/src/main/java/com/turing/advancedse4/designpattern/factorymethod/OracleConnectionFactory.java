package com.turing.advancedse4.designpattern.factorymethod;

public class OracleConnectionFactory extends ConnectionFactory{

	@Override
	Connection getConnection() {
		return new OracleConnection();
	}

}
