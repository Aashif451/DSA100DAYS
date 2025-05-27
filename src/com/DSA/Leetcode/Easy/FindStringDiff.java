package com.DSA.Leetcode.Easy;

public class FindStringDiff {
	
	String chars="aabbc";
	
	 int[] charCount = new int[26];
    for (char ch : chars.toCharArray()) {
        charCount[ch - 'a']++;
    }

}
