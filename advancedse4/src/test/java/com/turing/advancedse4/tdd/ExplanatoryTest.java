package com.turing.advancedse4.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

@ExtendWith(MockitoExtension.class)
public class ExplanatoryTest {
private static final Logger log = (Logger) LoggerFactory.getLogger(ExplanatoryTest.class);
	@BeforeAll
	static void setup() {
	    log.info("@BeforeAll - executes once before all test methods in this class");
	}

	@BeforeEach
	void init() {
	    log.info("@BeforeEach - executes before each test method in this class");
	}
	@AfterEach
	void afterEach() {
	    log.info("@AfterEach - executes after each test method in this class");
	}
	//@Disabled
	@Test
	@DisplayName("Test String upperCase method return uppercase")
	void testUpperCase()
	{
		String str = "hello";
		
		str = str.toUpperCase();
		
		assertEquals("HELLO", str);
		log.info("This "+this);
		
		try
		{
			throw new Exception();
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}
		/*
		Thread thread = Thread.currentThread();
        StackTraceElement[] stackTraces = thread.getStackTrace();
        for(StackTraceElement ele : stackTraces)
        {
        	log.info(ele.getClass()+" "+ ele.getMethodName());
        }
        */
	}
	@Test
	void testLowerCase()
	{
		String str = "HELLo";
		
		str = str.toLowerCase();
		
		assertEquals("hello", str);
		log.info("This "+this);
	}

	@AfterAll
	static void done() {
	    log.info("@AfterAll - executed after all test methods.");
	}
}
