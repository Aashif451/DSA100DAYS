package com.DSA.queue.easy;

import java.util.Arrays;
import java.util.List;

public class MainClass {
	
	
	public static void main(String[] args) {
		
//		String str ="Aashif";
//		  StringBuilder reverseString = ReverseStringUsingStack.ReverseString(str);
//		
//		System.out.println("reverseString   "+reverseString);
//		
		String str1="Hello World hii this is Aashif";
		
		
		 List<String> strList = ReverseSentenceWordByWord.reverseSentenceWordbyWord(str1);
		
		strList.stream().forEach(System.out::print); 
// @formatter:on

		
	}

}
