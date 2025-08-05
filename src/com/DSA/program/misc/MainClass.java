package com.DSA.program.misc;

import java.util.*;
import java.util.stream.Collectors;



public class MainClass {

	
	public static void main(String[] args) {
		
		
//		write a code to find a deparment name which is paying the  maximum average salary of there employee
		
		List <Employee> ListEmp=List.of(new Employee(101L, "Ramesh", 200000d,"IT"),
				new Employee(102L, "Ramu", 500000d,"sales"),
				new Employee(103L, "Rajesh", 700000d,"DEV"),
				new Employee(103L, "Rajesh", 800000d,"DEV"),
				new Employee(102L, "Ramu", 300000d,"sales"));
		
		
		 String data = ListEmp.stream().
				collect(Collectors.groupingBy(Employee::getDepatmentName,
						Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("bfgbdj");
		 
		 System.out.println("HII "+data);
		
		 
		 
				
}
	
	
	
	
}
