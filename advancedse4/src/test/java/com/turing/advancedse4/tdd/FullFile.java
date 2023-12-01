package com.turing.advancedse4.tdd;

import java.io.File;
import java.io.IOException;

public class FullFile extends File {
	private static final long serialVersionUID = 1L;

	public FullFile(String path)
	{
		super(path);
	}
	@Override
	public boolean createNewFile() throws IOException 
	{
		System.out.println("Full file create");
		throw new IOException("Custom IO Exception");
	}
}
