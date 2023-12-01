package com.turing.advancedse4.tdd;

import java.io.File;
import java.io.IOException;

public class CrashTest {
	boolean createFile(File file) throws IOException
	{
		return file.createNewFile();
	}
}
