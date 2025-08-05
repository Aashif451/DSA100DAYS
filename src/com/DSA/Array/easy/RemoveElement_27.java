package com.DSA.Array.easy;

public class RemoveElement_27 {

	public int removeElement(int[] nums, int val) {

		int len = nums.length;

		int k = 0;

		for (int i = 0; i <= len - 1; i++) {
			if (nums[i] != val) {

				nums[k++] = nums[i];

			}
		}
		return k;
	}

}
