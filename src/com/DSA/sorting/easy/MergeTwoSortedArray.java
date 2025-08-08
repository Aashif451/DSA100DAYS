package com.DSA.sorting.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArray {
	public static List<Integer> mergeTwoSortedArr(int arr1[], int arr2[]) {

		int first = 0;
		int second = 0;
		int len1 = arr1.length - 1;
		int len2 = arr2.length - 1;
		
		List<Integer> resultData = new ArrayList<>();
		while (first < len1 && second < len2) {
			if (arr1[first] < arr2[second]) {
				resultData.add(arr1[first++]);

			} else {
				resultData.add(arr2[second++]);

			}
		}
		while(first < len1) {
			resultData.add(arr1[first++]);
		}
		while(second < len2) {
			resultData.add(arr2[second++]);
		}

		return resultData;

	}

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7, 9 };
		int arr2[] = { 2, 4, 6, 8 };
		 List<Integer> mergeTwoSortedArr = mergeTwoSortedArr(arr1, arr2);
		System.out.println("Array Merged");

		mergeTwoSortedArr.stream().forEach(System.out::print);

	}
}
