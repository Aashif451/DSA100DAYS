package com.DSA.queue.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseSentenceWordByWord {
	
	
	public static List<String> reverseSentenceWordbyWord(String Str) {
		
//		List<String> str1=new ArrayList<>();
		
		List<String > strList=new ArrayList<>();
		Stack<Character> ch=new Stack<>();
		
		
		 String[] split = Str.split(" ");
		 for (int i=0; i<split.length; i++) {
			      String str = split[i];
			      char[] charArray = str.toCharArray();
			      
			      for (char charArr :charArray) {
			    	  ch.push(charArr);
			    	  
			      }
			      String Str1=" ";
			      while (!ch.isEmpty()) {
			    	  Str1+=ch.pop() ;
			      }
			      
			      strList.add(Str1);
			      
			 
			 
			 
		 }
		
		 
		 

		
		
		
		return strList;
	}
	

}
