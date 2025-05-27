package com.DSA.Leetcode.Easy;

import java.util.List;

public class DriverClass {
	
	
	public static void main (String [] args) {
//		String chars="aabbcwetruyi";
//		
//		 int[] charCount = new int[26];
//	    for (char ch : chars.toCharArray()) {
//	        charCount[ch - 'a']++;
//	    }
//	    for (int ch :charCount) {
//	    	System.out.println("int data :"+ch);
//	    }
		int [] arr= {12,45,34,65,6,7,8};
		
		int secondLargest=SecondLargest.getSecondLargest(arr);
		System.out.println("second Largest Data "+secondLargest);
		
		List<Integer> thirdLargestDistinct = ThirdLargestDistinctElement.getThirdLargestDistinct(arr);
		System.out.println("list Data "+thirdLargestDistinct);
		
		
	}

}
