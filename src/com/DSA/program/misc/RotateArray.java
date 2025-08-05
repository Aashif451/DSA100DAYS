package com.DSA.program.misc;

import java.util.Arrays;
import java.util.List;

public class RotateArray {
	/******************************************************************************

	Welcome to GDB Online.
	GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
	C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
	Code, Compile, Run and Debug online from anywhere in world.

	*******************************************************************************/
	
		public static void main(String[] args) {
//	 		System.out.println("Hello World");
			

	int [] arr = {1,2,3,4,5,6,7};
	int target=4;
	// Output: [6,7,1,2,3,4,5]

	    int[] leftRotate = leftRotate(arr,target);
	    Arrays.stream(leftRotate).forEach(System.out::println);
	    
	   System.out.println("Rotated Array"+leftRotate);





	 	}
	 	
	 	public static int [] leftRotate(int arr[],int k){
	 	    
	 	    int len=arr.length;
	 	    
	 	    k%=len;
	 	    
	 	    reverse(arr,0,len-1);
	 	    reverse(arr ,0,k-1);
	 	    reverse(arr, k,len-1);
	 	    
	 	    
	 	    return arr;
	 	}
	 	
	 	public static void reverse(int arr[],int start,int end){
	 	    
	 	    while (start<end){
	 	        
	 	        int temp=arr[start];
	 	        arr[start++]=arr[end];
	 	       arr[end--]=temp;
	 	        
	 	        
	 	    }
	 	    
	 	    
	 	}
	


}
