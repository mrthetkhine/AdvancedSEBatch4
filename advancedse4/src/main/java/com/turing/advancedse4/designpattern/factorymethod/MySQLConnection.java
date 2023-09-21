package com.turing.advancedse4.designpattern.factorymethod;

public class MySQLConnection extends Connection{

	@Override
	void open() {
		System.out.println("MySQL Connection open");
		
	}

	@Override
	void close() {
		System.out.println("MySQL Connection close");
	}

}
