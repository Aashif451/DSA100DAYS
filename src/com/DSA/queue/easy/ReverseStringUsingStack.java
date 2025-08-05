package com.DSA.queue.easy;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static StringBuilder ReverseString(String Str) {

		Stack<Character> stackData = new Stack<>();
		for (char ch : Str.toCharArray()) {
			stackData.push(ch);
		}
		
		stackData.forEach(System.out::println);
		System.out.println("Stack Size Data "+
				stackData.size());
		StringBuilder str1 = new StringBuilder();
		while (!stackData.isEmpty()) {
			str1.append(stackData.pop());
		}
		
		
		System.out.println("String Builder Data "+str1);
		return str1;
	}

}
