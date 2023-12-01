package com.turing.advancedse4.tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CrashTestDummy {

	@Test 
	void crashTest()
	{
		CrashTest crashTest = new CrashTest();
		
		assertThrows(IOException.class, ()->{
			crashTest.createFile(new FullFile("nothing"));
		});
		
	}
}
