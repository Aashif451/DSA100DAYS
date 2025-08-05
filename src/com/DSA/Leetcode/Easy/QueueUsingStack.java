package com.DSA.Leetcode.Easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.DSA.Array.easy.ArrayapplyOperations_2460;

public class QueueUsingStack {
	public static void main(String[] args) {
		int arr[] = {1, 3 ,5,7,6};
		int target =10;
		
		twoSum(arr,target);
		
}
	
	
	public static int [] twoSum( int []arr ,int target) {
		int countZeros=0; 
		
			Map<Integer,Integer> mapData=new HashMap<>();
			int index=0;
			
	   for (int i=0; i<arr.length; i++) {
		   int serchingData=target-arr[i];
		   
		   if(mapData.containsKey(serchingData)) {
			   
			   return new int [] {mapData.get(serchingData),i};
			   
			   
			   
		   }
		   
		   
		  
		   
		  
		   
	   }
	   
	   
	   for(Integer value: mapData.keySet()) {
//		   System.out.println("keys :"+entry.getKey() +"Values"+entry.getValue());
		   
		   
		   
	   }
	   
	   
//	   for ()
	return null;
	
		
		
	}
	
	
	
	
	

}
