package com.DSA.Array.easy;

public class LargestElement {
	
	
	public static int  largestElement (int arr[]) {
		int maxElement=-1;
		for (int i=0; i<arr.length-1; i++) {
			
			if(arr[i]>maxElement) {
				maxElement=arr[i];
				
			}
		}
		
		
		return maxElement;
		
	}
	

}
