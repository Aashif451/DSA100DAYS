package com.DSA.Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class ThirdLargestDistinctElement {
	
	public static List<Integer> getThirdLargestDistinct(int arr []){
		ArrayList<Integer> ListData=new ArrayList<>();
		int fstLargest=Integer.MIN_VALUE;
		int scndLargest=Integer.MIN_VALUE;
		int thrdLArgest=Integer.MIN_VALUE;
		
		
		for (int arrData:arr) {
			
			if(arrData>fstLargest) {
				thrdLArgest=scndLargest;
				scndLargest=fstLargest;
				fstLargest=arrData;
				
			}else if (arrData>scndLargest &&  arrData!=fstLargest) {
				thrdLArgest=scndLargest;
				scndLargest=arrData;
				
				
			}else if (arrData>thrdLArgest &&  arrData!=fstLargest && arrData!=scndLargest) {
				scndLargest=arrData;
			}
			
		}
		
		if(fstLargest==Integer.MIN_VALUE)
			return ListData;
		ListData.add(fstLargest);
		if(scndLargest==Integer.MIN_VALUE)
			return ListData;
		ListData.add(scndLargest);
		if(scndLargest==Integer.MIN_VALUE)
			return ListData;
		ListData.add(thrdLArgest);
		
		
		
		return ListData;
	}


}
