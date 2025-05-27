package com.DSA.Array.easy;

public class CheckIfSorted {
	
	
	public static Boolean isSorted(int arr[]) {
		
		for (int i=0; i<arr.length-1; i++) {
			if (!(arr[i+1]>arr[i]) ) {
				
				return false;
				
				
			}
		}
		
		
		
		
		
		
		return true;
	}
	

}
