package com.DSA.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top30AdvanceSteamProgram {
	
//	 Top 30 Advanced Java 8 Stream Programs
//	 ✅ 1–10: Advanced Collection Manipulation
//	 Find duplicate elements in a list using streams.
//
//	 Find the second highest number in a list.
//
//	 Group employees by department and count them.
//
//	 Find the highest-paid employee in each department.
//
//	 Sort a list of employees by multiple fields (e.g., salary then name).
//
//	 Find common elements between two lists.
//
//	 Get frequency count of characters in a string.
//
//	 Partition employees based on salary > 50,000.
//
//	 Get top 3 highest numbers from a list.
//
//	 Flatten a list of lists into a single list.
//
//	 ✅ 11–20: Data Transformation and Filtering
//	 Find palindrome strings from a list.
//
//	 Remove null and empty strings from a list.
//
//	 Convert list of objects to a map (id -> name).
//
//	 Filter all employees whose name starts with a given letter and sort by salary.
//
//	 Find sum and average of salaries grouped by department.
//
//	 Convert list of integers to their square and remove duplicates.
//
//	 Find the longest string in a list.
//
//	 Convert a list of dates to formatted string (yyyy-MM-dd).
//
//	 Extract only digits from a mixed string and sum them.
//
//	 Find the most repeated word in a paragraph using streams.
//
//	 ✅ 21–30: Stream Creation, Map/FlatMap, Complex Reductions
//	 Generate a stream of first 10 prime numbers.
//
//	 Generate a Fibonacci series using Stream.iterate() and limit.
//
//	 Get list of employees joined after a specific date.
//
//	 Group transactions by type and then by customer.
//
//	 Map nested object list to flat list using flatMap() (e.g., list of courses per student).
//
//	 Convert comma-separated string to list and sort alphabetically.
//
//	 Count vowels and consonants in a string using stream.
//
//	 Remove duplicates from list of custom objects (e.g., by id).
//
//	 Find the youngest and oldest employee in an organization.
//
//	 Check if all/any/no elements in list match a predicate (e.g., all salaries > 10k).
	
	public static void main(String[] args) {
		
		List<Integer> listData=List.of(12,34,45,66,77,4,5,6,7,34,4);
		Integer integer = listData.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).findFirst().orElse(-1);	
		System.out.println("integer"+integer);
		
	}

}
