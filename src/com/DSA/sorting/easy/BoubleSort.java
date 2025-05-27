package com.DSA.sorting.easy;

public class BoubleSort {
	
	public static int[] bubbleSorting(int arr[]) {
		
		int len=arr.length;
		
		
		for (int i=0; i<len-1; i++) {
			
			boolean checkIsSorted=false;
			for (int j=0; j<len-i-1; j++) {
				
				if (arr[j]>arr[j+1]) {
					checkIsSorted=true;
					swap(j,j+1,arr);
				}	
			}
			
			if (!checkIsSorted)
				break;
				
		}
			
		return arr;
	}
	
	
	private static void swap(int i, int j, int arr[]) {
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	

}
