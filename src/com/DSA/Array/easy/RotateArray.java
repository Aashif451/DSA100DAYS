package com.DSA.Array.easy;


//rotate an array at Dth Position

public class RotateArray {
	
	
	public static int [] getRotateArray(int arr[] ,int d) {
		
		int len =arr.length;
		d=d%len;
		reverse(arr,0,d-1);
		reverse(arr,d,len-1);
		reverse(arr,0,len-1);
		
		return arr;
	}
	
	public static void reverse(int []arr, int start,int end) {
		
		while(start<end) {
			int temp=arr[start];
			arr[start++]=arr[end];
			arr[end--]=temp;
			
			
		}
		
   }
	
}
