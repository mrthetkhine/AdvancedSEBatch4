package com.turing.advancedse4.tdd;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StackTest {
	Stack stack = new Stack();
	
	@Test
	public void stackEmptyShouldReturnSizeZero()
	{
		//Arrange		
		
		//Act
		int size = stack.size();
		
		//Assert
		assertEquals(0, size);
	}
	@Test 
	void stackSizeShouldBeOneIfPushOneElement()
	{
	
	    stack.push(10);
	   
	    int size = stack.size();
	    
	    assertEquals(1, size);		
	}
	
	@Test
	void testPushWithSingleElement()
	{
		int originalSize = stack.size();
		stack.push(10);
		
		int size = stack.size();
		assertEquals(originalSize+1, size);		
		
		int element = stack.pop();
		assertEquals(10, element);
	}
	@Test
	void testPushWithMultipleElement()
	{
		int originalSize = stack.size();
		stack.push(10);
		stack.push(20);
		
		int size = stack.size();
		assertEquals(originalSize+2, size);		
		
		int first = stack.pop();
		assertEquals(20, first);
		
		int second = stack.pop();
		assertEquals(10, second);
	}
	@Test
	void testPushWithMaximumElement()
	{
		int originalSize = pushStackFullElement();
		
		int size = stack.size();
		assertEquals(originalSize+Stack.STACK_SIZE, size);		
		
		for(int i=0;i<Stack.STACK_SIZE;i++)
		{
			int result = stack.pop();
			assertEquals(10-(i+1), result);
		}
		
	}
	@Test
	void stackShouldThrowExceptionWhenFull()
	{
		int originalSize = pushStackFullElement();
		
		StackoverflowException except = assertThrows(StackoverflowException.class,()->{
			stack.push(1000);
		}); 
		assertEquals(Stack.STACK_OVERFLOW_MESSAGE, except.getMessage());
		
		int size = stack.size();
		assertEquals(originalSize+Stack.STACK_SIZE, size, "Size should not change");		
		
	}
	private int pushStackFullElement() {
		int originalSize = stack.size();
		for(int i=0;i<Stack.STACK_SIZE;i++)
		{
			stack.push(i);
		}
		return originalSize;
	}
}
