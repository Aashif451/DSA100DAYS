package com.DSA.Array.mediam;

public class MaximumSubArray {
	

//	bruteforce Method
	
	static int getMaximumSubArray(int arr[]) {
		
//		arr=[2,3,-4,7,2,-9]
		
		int len =arr.length;
		int resultMax=Integer.MIN_VALUE;
		
		for (int i=0; i<len; i++) {
			int CurrentMax=0;
			for (int j=i; j<len ; j++) {
				CurrentMax+=arr[j];
				resultMax=Math.max(CurrentMax, resultMax);
				
			}
			
			
		}
		return resultMax;
		
		
		
		
		
	}
	
	
//	kadane's algo
	
	
static int getMaximumSubArrayUsingalgo(int arr[]) {
		
//		arr=[2,3,-4,7,2,-9]
		
		int len =arr.length;
		int resultMax=arr[0];
		int MaxEnding=arr[0];
		
		for (int i=0; i<len; i++) {
			MaxEnding=Math.max(MaxEnding+arr[i], arr[i]);
			resultMax=Math.max(MaxEnding, resultMax);
			
			
		}
		
		
		return resultMax;
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,-8,4,-1,7,5,-6};
		int maximumSubArray = getMaximumSubArray(arr);
		
		System.out.println("maximumSubArray  :"+maximumSubArray);
		
	}
	

}
