package com.DSA.program.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFreq {

	public static void main(String[] args) {
	
		
		//two sum 
		//rotate array
		//move all zeros
		//missing number
		//maximum subarray sum
		//majority 
		//longest consequtive
		//sub array with given sum
		//minimum number of jump to reach end
//		10. Sort an Array of 0s, 1s, and 2s
		
//		Input: nums = [2,2,1,1,1,2,2]
//				Output: 2
		
		int [] arr4= {2,2,1,1,2,2,3};
		
		int majorityData=majorityElelment(arr4);
		System.out.println("majority Element"+majorityData);
		
		int arr[]= {1,4,5,7,9};
		int newIndex[]=findTwosum(arr,13);
//		System.out.println("new index :"+newIndex);
		Arrays.stream(newIndex).forEach(k->System.out.print("hii "+k));
		int rotation =4;
		
		
		
		rotateArray(arr ,rotation);
		Arrays.stream(arr).forEach(k->System.out.print(" "+k));
		
		int arr3[]= {1,2,0,0,3,0,0,4,6,0,0};
		moveAllZeros(arr3);
		Arrays.stream(arr3).forEach(k->System.out.println("Move All Zeros :"+k));
		
		
		int arr1[]= {1,2,3,4,6};
		
		int missingNumbers = missingNumbers(arr1);
		System.out.println("missingNumbers   :"+missingNumbers);
		int arr2[]= {1,2,-13,4,5,-10,7,-4,10};
		int n=maximumSubArraySum( arr2);
		System.out.println("maximumSubArraySum "+n);
		
		
		
		
	}

	private static int majorityElelment(int[] arr4) {
		
		int len=arr4.length;
		Map<Integer,Integer> mapData=new HashMap<>();
		for (int i=0; i<arr4.length; i++) {
				mapData.put(arr4[i], mapData.getOrDefault(arr4[i], 0) + 1);
				
		}
		
		for (Map.Entry<Integer, Integer> entry: mapData.entrySet()) {
		  if (entry.getValue()==len/2) {
			  return entry.getKey();
		  }
		}
		
		
		return 0;
	}

	private static int maximumSubArraySum(int[] arr) {
			int maximum=0;
	int 	sum=0;
		for (int i=0; i<arr.length;i++) {
			sum+=arr[i];
			
			
			
			if(sum>maximum) {
				maximum=sum;
			}
			
			if(sum<0) {
				sum=0;
			}
			
			
		}
		
		
		return sum;
	}

	private static int missingNumbers(int[] arr1) {
		
//		Map<Integer,Integer> mapData=new HashMap<>(); 
		
		int sum=0;
		int sumAll=0;
	     
		for(int i=0; i<arr1.length; i++) {
			
			sum+=arr1[i];
			
		}
		
		for (int i=1; i<=arr1.length+1; i++) {
			sumAll+=i;
		}
		
		int result =sumAll-sum;
		
		return result;
		
		
		
	}

	private static void moveAllZeros(int[] arr) {
		
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			
			if (arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
				
				
			}
		}
		
		
		
	}

//	1,2,3,8,4,5,1,3     d=3
	private static void rotateArray(int[] arr, int rotation) {
		int n=	arr.length;
		int d=rotation%n;
		
		
		
		reverse(arr,0,n-1);
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		
	
		
	
		
	}

	private static void reverse(int[] arr, int start, int end) {
		
		while (start<end) {
			
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
			
		}
	
	
}

	private static int[] findTwosum(int[] arr,int target) {
		
		
		int SearchingData=0;
		Map<Integer,Integer> MapData=new HashMap<>();
		for (int i=0; i<arr.length; i++) {
			SearchingData=target-arr[i];
			
			if (MapData.containsKey(SearchingData)) {
				
				return new int [] {MapData.get(SearchingData),i};
			}
			
			
			MapData.put(arr[i], i);
		}
		
		return null;
	}
	
	
}
