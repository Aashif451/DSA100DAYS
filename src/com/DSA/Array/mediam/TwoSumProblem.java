package com.DSA.Array.mediam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 3, 2 };
		int k = 11;

		int[] findTwoSum = findTwoSum(arr, k);
		Arrays.stream(findTwoSum).forEach(System.out::print);
	}

	public static int[] findTwoSum(int[] arr, int target) {

		Map<Integer, Integer> mapData = new HashMap<>();
		int pos = 1;
		for (int i = 0; i < arr.length; i++) {
			int searchElement = target - arr[i];
			if (mapData.containsKey(searchElement)) {
				System.out.println("searchElement" + searchElement + "arr[i]" + arr[i]);
				return new int[] { searchElement, arr[i] };

			}
			mapData.put(arr[i], pos++);

		}

		return null;
	}

}
