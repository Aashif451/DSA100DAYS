package com.DSA.Array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LeadersInArray {
	
//	[10,34,54,2,54,65,45,10,15, 5 ,35,32]
	
//	65 45 35 32
	
	public static List<Integer> getLeaderElement(int arr[]) {
		
		
		List<Integer> ListData=new ArrayList<>();
		
		 int MaxRight=arr[arr.length-1];
		 
		 ListData.add(MaxRight);
		 
		 for (int i=arr.length-2; i>=0; i--) {
			 
			 if(arr[i] >MaxRight) {
				 
				 MaxRight=arr[i];
				 ListData.add(MaxRight);
				 
			 }
			 
		 }
		Collections.reverse(ListData);
		

		
		return ListData;
	}

}
