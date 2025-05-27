package com.DSA.String.easy;

public class ReverseWordByWord {
	
	
	
//	Please write a program that takes a string as input and returns 
//	a string with all the words in reverse order. For example, 
//	if the input string is “This is a Program,” the output string 
//	should be “Program a is This.”
	
	
	
	public static void main(String[] args) {
		
		String str="This is a Program"	;
		
		String [] strArray=str.split(" ");
		int i=strArray.length-1;
		
		
		while (i>=0) {
			
			System.out.println(strArray[i]);
			i--;
		}
		
		
		
		
		
	}

}
