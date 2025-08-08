package com.DSA.stack.easy;

import java.util.Stack;

public class Parenthesuschaecker {

	public static void main(String[] args) {

		String str = "Aashif(ansari{jalalpur[bakhradostpur}sultanpur)uttarPradesh";
		System.out.println(checkParanthesis(str));
		
		

	}

	public static boolean checkParanthesis(String str) {

		Stack<Character> charStack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '{' || ch == '(' || ch == '[') {
				charStack.push(ch);
			}
			else if
			 (ch == '}' || ch == ')' || ch == ']') {
				
				if (charStack.isEmpty())
					return false;
				
				Character pop = charStack.pop();
				
				if (!isMatch(pop, ch))
					return false;
			}

		}
	

		return charStack.isEmpty();
	}
	
	
    private static boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }



}
