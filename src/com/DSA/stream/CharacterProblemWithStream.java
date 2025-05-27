package com.DSA.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharacterProblemWithStream {
	
	
//	1. Count the Number of Vowels in a String
//	Question: Write a Java program that counts the number of vowels in a given string using streams.
//
//	2. Remove Duplicates from a String
//	Question: Write a Java program that removes duplicate characters from a string while maintaining the original order of characters using streams.
//
//	3. Reverse a String
//	Question: Write a Java program that reverses a given string using streams.
//
//	4. Check if a String is a Palindrome
//	Question: Write a Java program that checks if a given string is a palindrome using streams.
//
//	5. Find the First Non-Repeating Character
//	Question: Write a Java program that finds the first non-repeating character in a string using streams.
//
//	6. Count Character Frequencies
//	Question: Write a Java program that counts the frequency of each character in a string and prints the result using streams.
//
//	7. Convert a String to a Character Array
//	Question: Write a Java program that converts a string into a character array using streams.
//
//	8. Sort Characters in a String
//	Question: Write a Java program that sorts the characters of a string in ascending order using streams.
//
//	9. Capitalize Each Character in a String
//	Question: Write a Java program that capitalizes each character in a string using streams.
//
//	10. Group Characters by Even and Odd Index
//	Question: Write a Java program that groups characters of a string into two lists: one for characters at even indices and another for characters at odd indices using streams.

	public static void main(String[] args) {
		
		String StringData="HElloWorld";
		
//		 Write a Java program that counts the number of vowels in a given string using streams
		
//		long count = StringData.chars().mapToObj(c->(char)c).filter(c->"AEIOUaeiou".indexOf(c)!=-1).count();
//		
//		System.out.println("count Data :"+count);
////		Remove Duplicates from a String
//		
//		
////		without order maintain
//		Set<Character> collect = StringData.chars().mapToObj(c->(char)c).collect(Collectors.toSet());
//		
//		collect.stream().forEach(System.out::println);
//		
//		
//		String collect2 = StringData.chars().mapToObj(c->(char)c).distinct().map(String::valueOf).collect(Collectors.joining());
//		
//		System.out.println("count Data :"+collect2);
////		List<integer> listData=new Stack<>();
//		
//		
////		reverse a string
//		String reverseData = StringData.chars().mapToObj(c->(char)c).reduce("", (s, c) -> c + s, (s1, s2) -> s1 + s2); 
//		
//		
//		System.out.println("count Data :"+reverseData);
//		
////		count Frequency in String
//		   Character orElse = StringData.chars().mapToObj(c-> (char)c ).
//				collect(Collectors.groupingBy(w->w, Collectors.counting()))
//				.entrySet().stream().filter(c->c.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
//		   
//		   System.out.println("unique character Data  :"+orElse);
//		
////		collect3.entrySet().stream().forEach(c->System.out.println("get Keys: "+c.getKey()+"  get Values :"+c.getValue()));
//		
////		Write a Java program that finds the first non-repeating character in a string using streams.
//		
////		
//		
//		
////		StringData.chars().mapToObj(c -> (char) c)
////				.collect(Collectors.groupingBy(Collectors.groupingBy(w->w, Collectors.counting()));
//		
//		
//		
//		
////		 Convert a String to a Character Array
//		
//		StringData.chars() // Create an IntStream of character codes
//        .mapToObj(c -> (char) c) // Convert int to Character
//        .collect(StringBuilder::new, // Use StringBuilder to collect characters
//                StringBuilder::append, // Append each character
//                StringBuilder::append) // Merge StringBuilders
//        .toString() // Convert StringBuilder to String
//        .toCharArray(); // Convert String to char array
//		
//		
//		StringData.chars() // Create an IntStream of character codes
//        .mapToObj(c -> (char) c).map(Character::toUpperCase).collect(Collectors.toList());
//		
//		List<Character> collect4 = StringData.chars() // Create an IntStream of character codes
//        .mapToObj(c -> (char) c).map(Character::toUpperCase).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//		System.out.println("sorted character"+collect4);
//		
//		
////		Write a Java program that groups characters of a string into two lists: one for characters at even indices and another for characters at odd indices using streams.
////
//		IntStream.range(0, StringData.length())
//        .filter(i -> i % 2 == 0) // Keep only even indices
//        .mapToObj(StringData::charAt) // Map to characters
//        .collect(Collectors.toList()); // Collect to a lis
//		
//		
//		
//		
//		
//		StringData.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//		.entrySet().stream().filter(c->c.getKey()==1).findFirst().orElseThrow(null);
//		

		
//		1. Count the Number of Vowels in a String
//		Question: Write a Java program that counts the number of vowels in a given string using streams.
	//
//		
//		
//		long count = StringData.chars().mapToObj(c->(char) c ).filter(c-> "AEIOUaeiou".indexOf(c)!=-1).count();
//		System.out.println("Count" +count);
		
		
//		Set<Character> collect = StringData.chars().mapToObj(c->(char)c).collect(Collectors.toSet());
//		
//		
//	  Long orElseThrow = StringData.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//		.entrySet().stream().filter(entry->entry.getKey()==1).map(Map.Entry::getValue).findFirst().orElseThrow(null);
		
	 List<Character> collect = StringData.chars().mapToObj(c->(char)c).sorted(Character::compareTo).collect(Collectors.toList());
	 
	 collect.forEach(c->System.out.println("hii :"+c));
	}
	
	
	
	
}
