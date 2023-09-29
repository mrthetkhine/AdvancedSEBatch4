package com.turing.advancedse4.designpattern.template;

public class ExcelSender extends SMSSender{

	@Override
	void readFile() {
		System.out.println("Read Excel ");
		
	}

	public static void main(String[]args)
	{
		SMSSender sender = new CSVSender();
		sender.process();
		
		sender = new ExcelSender();
		sender.process();
	}
}
