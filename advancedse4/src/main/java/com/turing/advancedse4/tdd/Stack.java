package com.turing.advancedse4.tdd;

public class Stack {

	public static final String STACK_OVERFLOW_MESSAGE = "Cannot push element Stack is overflow";
	public static final int STACK_SIZE = 10;
	int top = 0;
	int data[] = new int[STACK_SIZE];
	
	public void push(int element) {
		if(this.top == STACK_SIZE)
		{
			throw new StackoverflowException(STACK_OVERFLOW_MESSAGE);
		}
		this.data[this.top++] = element;
	}

	public int pop() {
		return this.data[--this.top];
	}
	public int size()
	{
		return this.top;
	}

}
