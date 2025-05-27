package com.DSA.Array.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArraysProblems {
	
	
	
	public static void main(String[] args) {
		
		int [] arr= {0,0,0,3,12,0,3,4,4,50,0,8,0,7};
		Boolean sorted = CheckIfSorted.isSorted(arr);
		
		System.out.println("sorted   : "+sorted);
		
		int[] subArray = GenerateAllSubArray.getSubArray(arr);
		Arrays.stream(subArray).forEach(System.out::println);
		
		
		int largestElement = LargestElement.largestElement(arr);
		System.out.println("largestElement    :"+largestElement);
		
		
		int[] threeLargestElement = LargestThreeElement.getThreeLargestElement(arr);
		Arrays.stream(threeLargestElement).forEach(System.out::println);
		
		List<Integer> ListData= LeadersInArray.getLeaderElement(arr);
		
		System.out.println("LeadersInArray "+ListData);
		
		int value=20;
		LinearSearch.searchElement(arr,value);
		
		Set<Integer>  uniqueElement= RemoveDuplicateInSorted.removeDuplicateElement(arr);
		
		System.out.println("uniqueElement"+uniqueElement);
		
		List<Integer> ReversedData = ReverseArray.getReverseArray(arr);
		
		System.out.println("ReversedData"+ReversedData);
		
		int[] rotateArray = RotateArray.getRotateArray(arr,3);
		
		Arrays.stream(rotateArray).forEach(System.out::println);
		
		int secondLargest = SecondLargest.getSecondLargest(arr);
		
		System.out.println("leaderElement    :"+secondLargest);
		
		
		int[] moveZerosToEnd = ZerosToEnd.moveZerosToEnd(arr);
		
		System.out.println("leaderElement    :"+moveZerosToEnd);
		
		Arrays.stream(rotateArray).forEach(System.out::println);
		
		
		
		
		
		
	}

}
