package com.DSA.Array.easy;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
	
	
	
	
	public static List<Integer> getReverseArray(int []arr) {
		
		List<Integer> reversedData=new ArrayList<>();
		
		for (int i=arr.length-1 ; i>=0; i--) {
			reversedData.add(arr[i]);
			
			
		}
		
		
		
		return reversedData;
		
	}

}
