package com.DSA.Leetcode.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

	
	
	public static void main(String[] args) {
		int arr[]= {1,4,7,5};
		
//		--find even and odd
//		-- and square
		
		List<Integer> evenNumber = Arrays.stream(arr).filter(data -> data%2==0).boxed().collect(Collectors.toList());
		

		List<Integer> oddIntegers = Arrays.stream(arr).filter(data -> data%2!=0).boxed().collect(Collectors.toList());
		
		List<Integer> SquareIntegers = Arrays.stream(arr).map(data->data*data).boxed().collect(Collectors.toList());
		
		System.out.println("even numbers "+evenNumber);
		
		System.out.println("odd Numbers "+ oddIntegers);
		
		System.out.println(" SquareIntegers "+ SquareIntegers);
		
		
		
		
		
	}
}
