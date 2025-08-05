package com.DSA.String.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String[] args) {
		
//		String Reversal: Write a function to reverse a given string without using any built-in reverse functions.

//		Palindrome Check: How would you determine if a given string is a palindrome? Provide a function to check for palindromes.
//
//		Anagram Detection: Write a function that checks if two strings are anagrams of each other. What is the time complexity of your solution?
//
//		------Substring Search: Describe an efficient algorithm to find the first occurrence of a substring within a string. Can you implement it?
//
//		String Compression: Given a string, write a function to compress it using the counts of repeated characters. For example, "aabcccccaaa" would become "a2b1c5a3". What are the edge cases to consider?
//
//		------Longest Common Prefix: Write a function that takes an array of strings and returns the longest common prefix among them. What is the time complexity of your solution?
//
//		Character Frequency: How would you count the frequency of each character in a string? Can you implement this in a way that is efficient in terms of both time and space?
//
//		String Rotation: Given two strings, write a function to determine if one string is a rotation of the other. For example, "waterbottle" is a rotation of "erbottlewat".
//
//		Vowel Count: Write a function that counts the number of vowels in a given string. How would you optimize this function?
//
//	-----	String Interleaving: Given three strings, write a function to determine if the third string is an interleaving of the first two strings. For example, "aabcc" and "dbbca" can interleave to form "aadbbcbcac".
		
		String str1="this is the program";
		
		String[] split = str1.split(" ");
		int len=split.length-1;
		int i=0;
		StringBuilder st =new StringBuilder();
		
		while (i<=len) {
			st.append(new StringBuilder(split[i]).reverse());
			if (i!=len) {
				st.append(" ");
			}
			i++;
			
		}
		
		System.out.println("reversed Data "+st.toString());
		
	
	
//		StringBuilder st1 = new StringBuilder(str1);
//		System.out.println("Reversed Data: " + st.reverse().toString());

		
		
//check angram
		
		String stringData1 = "Listen";
		String stringData2 = "Silent";
		
		findoutAnagram(stringData1,stringData2);
		
		
		
		String str ="Aashif jamal ABCBA Saleem ACDCA Khalid Aashif Aashif ABCBA Saleem";
		
		
		System.out.println("hi this frequency");
		Map<Character, Long> collect = Arrays.stream(str.split(" "))
				.flatMap(word->word.chars()
						.mapToObj(c->(char) c))
				.map(Character::toUpperCase).
		collect(Collectors
				.groupingBy(Function
						.identity(),Collectors
						.counting()));
		
		collect.entrySet().forEach(n->System.out.println(n.getKey() + "    :"+n.getValue()));
		
		
		String strfreq="Aashif";
		
		Map<Character, Long> collect2 = strfreq.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function
						.identity(),Collectors.counting()));
		
		collect2.entrySet().forEach(n->System.out.println(n.getKey() + "    :"+n.getValue()));
		
		
		Map<String, Long> collect3 = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		collect3.entrySet().forEach(n->System.out.println(n.getKey() + "    :"+n.getValue()));
		System.out.println("hi this find the vowels");
		String strVowels="Aashif";
		List<Character> collect4 = strVowels.chars()
				.mapToObj(c->(char)c).filter(c->"AEIOUaeiou".indexOf(c)!=-1).collect(Collectors.toList());
		
		collect4.forEach(System.out::println);
		
//		chack if string is rotationed or not
		
		
		String strRotation1="waterbottle";
		
		
		String strRotation2="bottlewatar";
		
		
		boolean checkRotation = checkRotation(strRotation1,strRotation2);
		
		
		System.out.println("String Rotation"+checkRotation);
		

		
		
//		List<String> collect = Arrays.stream(split2).filter(p->isPlindrome(p)).collect(Collectors.toList());
//		collect.forEach(data->System.out.println("Palindrome  : "+data));
		
		
//		List<String> collectreverse = Arrays.stream(split2).map(p->reverseData(p).toUpperCase()).collect(Collectors.toList());
//		collectreverse.forEach(data->System.out.println("collectreverse  : "+data));
			
//		List<String> st =new ArrayList<>();
//		for (int i=0; i<str.length; i++) {
//			 st.add(reverseData(str[i]));
//		}
//		
//		st.forEach(data->System.out.println("collectreverse  : "+data));
		
		
	}


	private static boolean findoutAnagram(String charArray1, String charArray2) {
		
		if (charArray1.length()!=charArray2.length())
			return false;
		
		
		char[] charA = charArray1.toCharArray();
		char[] charB = charArray2.toCharArray();
//		Collectors.
		Arrays.sort(charA);
		Arrays.sort(charB);
		
		return 	Arrays.equals(charA, charB);
		
		
	
	}
	private static Object reverseList(String p) {
		StringBuilder st =new StringBuilder();
		st.append(st);
		String string = st.reverse().toString();
		
		return string;
	}

	private static Boolean isPlindrome(String p) {
		// TODO Auto-generated method stub
		
		int length = p.length();
		int right=length-1;
		int left=0;
		while(left<right) {
			if (p.charAt(left)!=p.charAt(right)) {
				return false;
				
			}
			
			left++;
			right--;
			
			
		}
		
		return true;
	}

	private static String reverseData(String p) {
		// TODO Auto-generated method stub
		return new  StringBuilder().append(p).reverse().toString();
	
	}

	
	public static boolean checkRotation(String strRotation1,String strRotation2){
		
		if (strRotation1==null|| strRotation2==null  || strRotation2.length()!=strRotation1.length() )
			return false;
		
		String finalStr=strRotation1 + strRotation2;
		return finalStr.contains(strRotation2);
		
			
			
			
		}

//	private static boolean isPlindrome(String p) {
//		StringBuilder st =new  StringBuilder();
//		st.append(p);
//		return p.equalsIgnoreCase(st.reverse().toString());
//	
//	}

}
