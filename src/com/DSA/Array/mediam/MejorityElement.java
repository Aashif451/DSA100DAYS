package com.DSA.Array.mediam;

public class MejorityElement {
	
	
	
	static int getMajorityElement(int arr[]) {
		
//		arr=[2,3,4,3,2,3,4,3,4,3,3,3,]
		
		int len=arr.length;
		int maxElement=0;
		for (int j=0; j<len; j++) {
			int currentMax=0;
		for (int i=0; i<len; i++)
		
		{
			if (arr[i]==arr[j]) {
				
				currentMax++;
			}
		}
		if (maxElement<currentMax)
			maxElement=currentMax;
		}
		
		if (maxElement>len/2)
			return maxElement;
		
		
	
	
	return maxElement;
	}
}

