package com.DSA.Array.easy;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {
	
	
	
	public static int getSecondLargest(int arr[]) 
//	{
		
//		int secondHighest = Arrays.stream(arr).boxed()
//				.sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
//		
//		System.out.println("secondHighest   +"+secondHighest);
//		
//		return secondHighest;
		
//		int Largest=Integer.MIN_VALUE;
//		int secondLargest=Integer.MIN_VALUE;
//		for (int i=0; i<arr.length; i++) {
//			if(arr[i]>Largest) {
//				secondLargest=Largest;
//				Largest=arr[i];
//				
//			}
//			else if(arr[i] < Largest && arr[i] > secondLargest) {
//	        	secondLargest = arr[i];
//	        }
//			
//		}
//		System.out.println("secondLargest ---"+secondLargest);
//		return secondLargest;
//	}
	
	
	
	
	{
		int len=arr.length;
		int largest=arr[0];
		int seondLargest=Integer.MIN_VALUE;
		
		for (int i=0;i<len; i++) {
			
			if (arr[i]>largest) {
				seondLargest=largest;
				largest=arr[i];
			}else if (arr[i]<largest && arr[i]>seondLargest){
				seondLargest=arr[i];
				
				
			}
		}
		return seondLargest;
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {12,43,34,54,53,2,2,3,3,4,4,5,55,12,5,67,23,65,87,1,0,-1,-8,34,65,200};
		System.out.println("Second Largest"+getSecondLargest(arr));
		
	}

}
