package com.DSA.sorting.easy;

import java.util.Arrays;

public class MainClass {
	
	
	public static void main(String[] args) {
		int arr []= {3,5,2,3,6,8,5,9,6};
//		
//		BoubleSort.bubbleSorting(arr);
//		Arrays.stream(arr).forEach(System.out::println);
		
		
//		InsertionSort.insertionSorting(arr);
		
		
		SelectionSort.selectionSorting(arr);
		Arrays.stream(arr).forEach(System.out::println);
		
		
	}

}
