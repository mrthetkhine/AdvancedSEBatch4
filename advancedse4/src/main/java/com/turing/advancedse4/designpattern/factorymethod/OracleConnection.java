package com.turing.advancedse4.designpattern.factorymethod;

public class OracleConnection extends Connection{

	@Override
	void open() {
		System.out.println("Oracle Connection open");
		
	}

	@Override
	void close() {
		System.out.println("Oracle Connection close");
	}

}
