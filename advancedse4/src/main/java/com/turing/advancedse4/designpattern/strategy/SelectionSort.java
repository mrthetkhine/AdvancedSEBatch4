package com.turing.advancedse4.designpattern.strategy;

public class SelectionSort implements SortStrategy{

	@Override
	public void sort() {
		System.out.println("Sorted with selection sort");
	}

}
