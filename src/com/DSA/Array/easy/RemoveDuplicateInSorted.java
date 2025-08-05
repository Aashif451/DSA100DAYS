package com.DSA.Array.easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInSorted {

	public static Set<Integer> removeDuplicateElement(int arr[]) {

		Set<Integer> UniqueElement = new HashSet<>();

		for (int i = 0; i < arr.length - 1; i++) {

			if (!UniqueElement.contains(i))
				UniqueElement.add(arr[i]);

		}

		return UniqueElement;
	}
	
	
public static void main(String[] args) {
	
	int []arr= {10,34,34,2,2,65,45,10,15, 5 ,35,32};
	Set<Integer> removeDuplicateElement = RemoveDuplicateInSorted.removeDuplicateElement(arr);
	
	removeDuplicateElement.stream().forEach(System.out::println);
	
	
}

}
