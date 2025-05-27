package com.DSA.Array.easy;

public class LinearSearch {

	public static boolean searchElement(int arr[],int value) {
		
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==value) {
				break;
				
			}
			return true;
		}
		
		
		
		
		return false;
		
	}
	
	
}
