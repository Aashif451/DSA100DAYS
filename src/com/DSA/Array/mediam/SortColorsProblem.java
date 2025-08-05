package com.DSA.Array.mediam;

import java.util.Arrays;

public class SortColorsProblem {

//	[2,1,2,1,2,1,2,1,2,1,0,0,1,2,0,2,0,2]

	public static void main(String[] args) {
		int arr[] = { 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 0, 0, 1, 2, 0, 2, 0, 2 };

//		0,0,0,1,0,1,1,1,1,1,2,2,2,,2

//		int[] sortColors = sortColors(arr);

		int[] sortColors = sortColorsSecond(arr);

		Arrays.stream(sortColors).forEach(System.out::print);
	}

	private static int[] sortColorsSecond(int[] arr) {

		int mid = 0;
		int low = 0;
		int high = arr.length - 1;

		while (mid <= high) {
			switch (arr[mid]) {
			case 0:
				// Swap low and mid
				swap(arr, low, mid);
				mid++;
				low++;
				break;

			case 1:

				mid++;
				break;

			case 2:
				// Swap mid and high
				swap(arr, mid, high);
				high--;
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + arr[mid]);
			}

		}

		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp0 = arr[i];
		arr[i] = arr[j];
		arr[j] = temp0;

	}

//  private static int [] sortColors(int arr[]) {
//	  int countZero=0; int countOnes=0; int counttwos=0;
//	  
//	  for (int i=0; i<arr.length; i++) {
//		  
//		  if (arr[i]==0) {
//			  countZero++;
//		  }else if(arr[i]==1) {
//			  countOnes++;
//		  }else {
//			  counttwos++;
//		  }
//		  
//		  
//		  
//	  }
//	  
//	 for (int i=0; i<countZero; i++) {
//		 arr[i]=0;
//	 }
//	 for (int i=countZero; i<countOnes+countZero; i++) {
//		 arr[i]=1;
//	 }
//	 for (int i=countOnes; i<arr.length; i++) {
//		 arr[i]=2;
//	 }
//	
//	return arr;
//	
//}

}
