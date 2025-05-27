package com.DSA.sorting.easy;

public class SelectionSort {
	
	
	
	public static int [] selectionSorting(int arr[]) {
		
		int len=arr.length;
		
		for (int i=0; i<len-1; i++) {
			
			int Min_Index=i;
			
			for (int j=i+1; j<len; j++) {
				if (arr[j]<arr[Min_Index])
					Min_Index=j;
			}
			
			if (Min_Index!=i) {
				
				swap(i,Min_Index,arr);
			}
			
			
			
		}
		
		
		
		
		
		return arr;
	}
	
	private static void swap(int i, int j, int arr[]) {
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	

}
