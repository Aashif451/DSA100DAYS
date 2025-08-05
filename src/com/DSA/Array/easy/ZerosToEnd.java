package com.DSA.Array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZerosToEnd {

//	first approach
//	public static  int[] moveZerosToEnd(int arr[]) {
//		
//		int len=arr.length;
//		List <Integer> listdata=new ArrayList<>();
//		
//		for (int i=0; i<len; i++) {
//			if (arr[i]!=0) {
//				listdata.add(arr[i]);
//			}
//		}
//		
//		System.out.println("----------------------------");
//		listdata.forEach(System.out::println);
//		
//		for (int i=0; i<listdata.size(); i++) {
//			arr[i]=listdata.get(i);
//		}
//		
//		System.out.println("Arrays.stream(arr).forEach(System.out::println);----------------------------");
//		Arrays.stream(arr).forEach(System.out::println);
//		for (int i=listdata.size(); i<len; i++) {
//			arr[i]=0;
//		}
//		
//		
//		return arr;
//		
//	}

	public static int[] moveZerosToEnd(int arr[]) {

		int len = arr.length;
//		int zero = -1;
//
//		for (int i = 0; i < len; i++) {
//			if (arr[i] == 0) {
//
//				zero = i;
//				break;
//
//			}
//		}
//
//		for (int i = zero + 1; i < len; i++) {
//
//			if (arr[i] != 0) {
//				swap(arr, zero, i);
//				zero++;
//
//			}
//		}
		
		int count =0;
		
		for (int i=0; i<len; i++) {
			
			if (arr[i]!=0) {
				arr[count]=arr[i];
				count++;
				arr[i]=0;
				
			}
			
		}

		return arr;

	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
	
	public static void main(String[] args) {
		int [] arr= {0,0,0,3,12,0,3,4,4,50,0,8,0,7};
		int[] moveZerosToEnd = ZerosToEnd.moveZerosToEnd(arr);
Arrays.stream(moveZerosToEnd).forEach(System.out::println);
		
	}

}
