package com.turing.advancedse4.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.turing.advancedse3.tdd.StaticUtil;
import com.turing.advancedse4.solid.Car;
import com.turing.advancedse4.solid.Engine;


@ExtendWith(MockitoExtension.class)
public class MockitoTest {

	@Mock
	Engine engine;
	
	@Test
	public void testMockito()
	{	
		List mockList = Mockito.mock(ArrayList.class);
		
		/*
		mockList.add("one");
		Mockito.verify(mockList).add("one");
		*/
		
		mockList.add("two");
		Mockito.when(mockList.get(0)).thenReturn("one");
		assertEquals("one",mockList.get(0));
		
		
		System.out.println("Get 0 "+mockList.get(0));
		
		///System.out.println("Mock get "+mockList.get(0));
		
		System.out.println("MockList size "+mockList.size());
		Mockito.when(mockList.size()).thenReturn(1);
		assertEquals(1,mockList.size());
		System.out.println("Get size "+mockList.size());
		
	}
	@Test 
	public void testSpy()
	{
		List<String> strList = Mockito.spy(new ArrayList<String>());
		///List<String> strList = Mockito.mock(ArrayList.class);
		
		strList.add("one");
		strList.add("two");
		
		System.out.println("Spy Get size "+strList.size());
		
		Mockito.verify(strList).add("one");
		Mockito.verify(strList,atLeast(2)).add(anyString());
		
		assertEquals(2,strList.size());
		
		Mockito.when(strList.size()).thenReturn(100);
		assertEquals(100,strList.size());
	}
	@Test
	public void testCaptureAgrument()
	{
		List mock = Mockito.mock(List.class);
		ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
		
		mock.add("one");
		//mock.add("two");
		Mockito.verify(mock,atLeast(1)).add(argument.capture());
		
		assertEquals("one",argument.getValue());
	}
	@Test
	public void testThrowException()
	{
		List mock = Mockito.mock(List.class);
		Mockito.when(mock.get(0)).thenThrow(NullPointerException.class);
		
		NullPointerException exception = assertThrows(NullPointerException.class, () -> {
			mock.get(0);
		});
		
	}
	@Test
	public void testDoThrowException()
	{
		Engine mock = Mockito.mock(Engine.class);
		doThrow(new NullPointerException()).when(mock).start();
		
		NullPointerException exception = assertThrows(NullPointerException.class, () -> {
			mock.start();
		});
		
	}
	@Test
	public void testMethodCallAtLeast()
	{
		Engine engine = Mockito.mock(Engine.class);
		Car car = new Car(engine);
		car.start();
		
		Mockito.verify(engine,atLeast(1)).start();
		
	}
	@Test
	public void testMethodCallNever()
	{
		Engine mock = Mockito.mock(Engine.class);
		//mock.start();
		Mockito.verify(mock,never()).start();
	}
	@Test
	public void testMethodCallAtMost()
	{
		Engine engine = Mockito.mock(Engine.class);
		
		Car car = new Car(engine);
		car.start();
		//car.start();
		
		Mockito.verify(engine,atMost(1)).start();
	}
	@Test 
	public void testMethodCallExactTime()
	{
		Engine engine = Mockito.mock(Engine.class);
		
		engine.start();
		engine.start();
		
		Mockito.verify(engine,times(2)).start();
	}
	@Test 
	public void testNoInteraction()
	{
		Engine engine = Mockito.mock(Engine.class);
		//engine.start();
		Mockito.verifyNoMoreInteractions(engine);
	}
	@Test
	public void testVerifyUnexpectedInteraction()
	{
		List<String> mockedList = Mockito.mock(ArrayList.class);
		
		mockedList.size();
		//mockedList.clear();
		
		verify(mockedList).size();
		verifyNoMoreInteractions(mockedList);
	}
	@Test
	public void testVerifyOrderOfInteraction()
	{
		List<String> mockedList = Mockito.mock(ArrayList.class);
		mockedList.size();
		mockedList.add("a parameter");
		mockedList.clear();

		InOrder inOrder = Mockito.inOrder(mockedList);
		inOrder.verify(mockedList).size();
		inOrder.verify(mockedList).add("a parameter");
		inOrder.verify(mockedList).clear();
	}
	@Test
	public void testMockStaticMethod() {
	    assertEquals("data",StaticUtil.getData());
	    
	    try (MockedStatic<StaticUtil> utilities = Mockito.mockStatic(StaticUtil.class)) {
	        utilities.when(StaticUtil::getData).thenReturn("Eugen");
	        assertEquals("Eugen",StaticUtil.getData());
	    }

	}
}
