package com.DSA.sorting.easy;

public class MergeSort {
	
	
	public int [] mergeSorting(int []arr , int low, int high) {
		
		if (low < high) {
			
			int mid= low+high/2;
			
			mergeSorting(arr, low,mid);
			mergeSorting(arr, mid+1,high);
			merge(arr, low ,mid, high);
			
			
			
			
			
			
		}
			
		
		
		
		
		
		
		
		return arr;
	}

	private void merge(int[] arr, int low, int mid, int high) {
		
		
		// TODO Auto-generated method stub
		
	}
	
	

}
