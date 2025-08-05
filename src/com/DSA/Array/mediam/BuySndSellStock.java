package com.DSA.Array.mediam;

import java.util.Arrays;

public class BuySndSellStock {
	
	
	
	


	public static void main(String[] args) {
		int []arr= {2,3,4,1,6,9,8,14,5};
		int bestTimetoBuyorSell = bestTimetoBuyorSell(arr);
		System.out.println("bestTimetoBuyorSell"+bestTimetoBuyorSell);
	}
	
	
	private static int  bestTimetoBuyorSell(int []arr) {
		
		int minElement=Integer.MAX_VALUE;
		int maximumSell=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]<minElement) {
				minElement=arr[i];
				
				
			}else {
				maximumSell=Math.max(maximumSell, arr[i]-minElement);
				
				
				
			}
			
			
			
		}
		
		
		
	
		return maximumSell;
		
	}
	
	
	

}
