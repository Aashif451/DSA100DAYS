package com.DSA.String.easy;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Sorting_the_Sentence_1859 {
//	
//	A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
//
//	A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
//
//	For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
//	Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
	
	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		String sortSentence = sortSentence(s);
		System.out.println("sorted List "+sortSentence);
		
	}
	
	
	
	public static String sortSentence(String  s) {
		StringBuilder strb=new StringBuilder();
		String str1[]=new String[10];
		int index=0;
		for (char ch :s.toCharArray()) {
			if (Character.isDigit(ch)) {
//				System.out.println("sorted List "+ch);
				index=ch-'0';
				str1[index]=strb.toString();
				strb.setLength(0);
				
				
			}else {
			strb.append(ch);
			}
			
		}
		
		return Arrays.stream(str1)
	            .filter(Objects::nonNull)
	            .collect(Collectors.joining(" "));
//		return Arrays.stream(str1).filter(objects::nonNull).collect(Collectors.joining(" "));
		
		
		
		
		
	}
	

}
