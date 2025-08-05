package com.DSA.stream;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top25Strems {
//
//Filter Even Numbers
//
//Write a program to filter even numbers from a list of integers.
//Square of Each Number   
//
//Given a list of integers, return a list containing the square of each number.
//Count Occurrences
//
//Count the occurrences of each word in a list of strings.
//Find Maximum Value
//
//Find the maximum value in a list of integers.
//Sum of All Elements
//
//Calculate the sum of all elements in a list of integers.
//Distinct Elements
//
//Given a list with duplicates, return a list of distinct elements.
//Sort a List
//
//Sort a list of strings in alphabetical order.
//Convert List to Uppercase
//
//Convert all strings in a list to uppercase.
//Group by Length
//
//Group a list of strings by their length.
//Find First Match
//
//Find the first string in a list that starts with the letter 'A'.
//Check for Any Match
//
//Check if any string in a list contains the substring "test".
//Concatenate Strings
//
//Concatenate all strings in a list into a single string, separated by commas.
//Average of Numbers
//
//Calculate the average of a list of integers.
//Filter and Collect
//
//Filter a list of integers to only include numbers greater than 10 and collect them into a new list.
//Count Unique Characters
//
//Count the number of unique characters in a string.
//Flatten a List of Lists
//
//Given a list of lists, flatten it into a single list.
//Find Palindromes
//
//Find all palindromic strings in a list.

//Create a Map from List
//
//Create a map where the key is the string and the value is its length from a list of strings.
//Remove Nulls
//
//Remove null values from a list of strings.
//Find Common Elements
//
//Find common elements between two lists.
//Partitioning a List
//
//Partition a list of integers into two lists: one for even numbers and one for odd numbers.
//Count Vowels in Strings
//
//Count the total number of vowels in a list of strings.
//Find the Longest String
//
//Find the longest string in a list.
//Create a Frequency Map
//
//Create a frequency map of characters in a string.
//Stream from Array
//
//Convert an array of integers to a stream and find the sum of all elements

	public static void main(String[] args) {

		List<Integer> ListData = List.of(2, 4, 6, 5, 1, 1, 9, 7, 8);
		List<Integer> ListData2 = List.of(1, 1, 9, 7, 8);
		List<List<Integer>> complxList = List.of(ListData, ListData2);
		List<String> StringListNull = Arrays.asList("Hi","this is Aashif",null,"Hello","hii");
		
		List<String> stringList = List.of("HII", "HELLO", "THIS", "IS", "AASHIF", "THIS");

		List<Employee> EmpList = List.of(new Employee(10, 1000.5, "Aashif"), new Employee(12, 1300.7, "Viany"),
				new Employee(15, 1050, "Gulshan"), new Employee(10, 1100.5, "Jamal")

		);

		List<Integer> EvenCollect = ListData.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		EvenCollect.forEach(System.out::print);

		List<Integer> Oddcollect = ListData.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		Oddcollect.forEach(System.out::print);

		List<Integer> Squarecollect = ListData.stream().map(n -> n * n).collect(Collectors.toList());
		Squarecollect.forEach(System.out::print);

		Map<String, Long> collect = stringList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.entrySet().stream().forEach(n -> System.out.println("keys :" + n.getKey() + "Value :" + n.getValue()));

		Map<Character, Long> collect2 = stringList.stream().flatMapToInt(String::chars).mapToObj(n -> (char) n)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect2.entrySet().stream()
				.forEach(n -> System.out.println("keys :>>>>>    " + n.getKey() + "     Value :>>>>" + n.getValue()));

		Integer integer = ListData.stream().max((n1, n2) -> Integer.compare(n1, n2)).orElse(-1);

		System.out.println("Max Element   : " + integer);

		Integer Summ = ListData.stream().reduce(0, (n1, n2) -> Integer.sum(n1, n2));
		System.out.println("Sum of All Element   : " + Summ);

		List<Integer> DistinctData = ListData.stream().distinct().collect(Collectors.toList());
		DistinctData.forEach(System.out::println);

		List<String> collect3 = stringList.stream().map(String::toLowerCase).collect(Collectors.toList());

		List<String> collect4 = stringList.stream().sorted(Comparator.nullsFirst(null)).collect(Collectors.toList());

		collect4.stream().forEach(System.out::println);

		ListData.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		List<Employee> collect5 = EmpList.stream().sorted(Comparator.comparing(Employee::getName)
				.thenComparingDouble(Employee::getSalary).thenComparingInt(Employee::getId))
				.collect(Collectors.toList());

		Map<Integer, List<String>> GrpByLengthMap = stringList.stream().collect(Collectors.groupingBy(String::length));

		GrpByLengthMap.entrySet().stream()
				.forEach(n -> System.out.println("Group Key Data " + n.getKey() + " Group Value Data " + n.getValue()));

		collect5.stream().forEach(n -> System.out.print(n.toString()));

		// Find the first string in a list that starts with the letter 'A'.
		String StartWithAString = stringList.stream().filter(n -> n.startsWith("A")).findFirst().orElse(null);
		System.out.println("StartWithAString " + StartWithAString);

		// Check if any string in a list contains the substring "test".

		List<String> listContainsH = stringList.stream().filter(n -> n.contains("H")).collect(Collectors.toList());
		listContainsH.stream().forEach(System.out::println);

		// Concatenate all strings in a list into a single string, separated by commas.

		String collect6 = stringList.stream().collect(Collectors.joining(","));

		System.out.println("Concatenate all strings in a list into a single string, separated by commas " + collect6);

		// Calculate the average of a list of integers.
		double orElse = ListData.stream().mapToInt(Integer::intValue).average().orElse(0);

		List<Integer> list = complxList.stream().flatMap(List::stream).toList();

		list.stream().forEach(System.out::println);

		// Filter a list of integers to only include numbers greater than 10 and collect
		// them into a new list.

		List<Integer> collect7 = ListData.stream().filter(n -> n > 5).collect(Collectors.toList());

		// Count the number of unique characters in a string.

		System.out.println("nrejkgnjrengkjenrgk");

		Set<Character> collect8 = stringList.stream().flatMapToInt(String::chars).mapToObj(n -> (char) n)
				.collect(Collectors.toSet());

		collect8.stream().forEach(System.out::println);

		// Find all palindromic strings in a list.

		stringList.stream().map(n -> Top25Strems.isPlindrome(n)).collect(Collectors.toList());
		
		Map<String, Long> collect9 = stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		//Remove null values from a list of strings.
		
		List<String> collect10 = StringListNull.stream().filter(n->n!=null).collect(Collectors.toList());
		

		System.out.println("nrejkgnjrengkjenrgk");
		
		collect10.stream().forEach(System.out::println);
		
		
		//
		//Find common elements between two lists.
		
		List<Integer> collect11 = ListData.stream().filter(ListData2::contains).collect(Collectors.toList());
		
		collect11.stream().forEach(System.out::println);
		
		Map<Boolean, List<Integer>> partitionData = ListData.stream().collect(Collectors.partitioningBy(n->n%2==0));
		
		System.out.println("nrejkgnjrengkjenrgk");
		
		List<Integer> list2 = partitionData.get(true);
		list2.stream().forEach(System.out::println);
		System.out.println("nrejkgnjrengkjenrgk");
		
		
		List<Integer> list3 = partitionData.get(false);
		list3.stream().forEach(System.out::println);
		
		//Count the total number of vowels in a list of strings.
		
		System.out.println("nrejkgnjrengkjenrgk");
		
		Map<Character, Long> collect12 = stringList.stream().flatMapToInt(String::chars).mapToObj(m->(char)m).
		filter(n->"AEIOU".indexOf(n)!=-1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		collect12.entrySet().stream()
		.forEach(n -> System.out.println("keys :>>>>>    " + n.getKey() + "     Value :>>>>" + n.getValue()));
		
//		stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
//		entrySet().stream().filter(m->m.getValue().max(Integer::compareTo)).findFirst().orElse(null);
		
		

	}

	public static boolean isPlindrome(String Str) {

		StringBuilder stb = new StringBuilder(Str);

		return Str.equalsIgnoreCase(stb.reverse().toString());

	}

}
