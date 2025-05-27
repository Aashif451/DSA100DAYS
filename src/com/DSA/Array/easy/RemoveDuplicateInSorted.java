package com.DSA.Array.easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInSorted {
	
	public static Set<Integer> removeDuplicateElement(int arr[]) {
		
		Set<Integer>  UniqueElement=
				new HashSet<>();
		
		for (int i=0; i<arr.length-1; i++) {
			
			if(arr[i]==arr[i+1])
				continue;
			else 
				UniqueElement.add(arr[i]);
			
		}
		
		
		
		
		return UniqueElement;
	}
	
	
	

}
