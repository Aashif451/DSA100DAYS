package com.DSA.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ListProblemWithStream {
	
	
	public static void main(String[] args) {
//		Merge two sorted linked lists into one sorted list.
		
		
				
				
		
		String s="Abhay";
		  char [] strchar= s.toCharArray();
		  
//		 Character ch= Arrays.stream.collect(Collectors.
//		  groupingby(Function.identity(),Collectors.counting))
//		  .entrySet().stream().filter(entry->entry.getKeys().length==1)
//		  .findFirst().elsethrows(-1);
////		  
//		  System.out.println(ch);
//		  a 2
//		  b 1
		  
		  
//		  map.put(key,Map)
		
		  
		  
//		  A -->   r1 
		  
		  
		  
//		  b  -->  r2 
		  
		
		
		
		List<Employee> empList = List.of(new Employee(101,450000d,"Rahul"),
				new Employee(101,4500d,"Raj"),
				new Employee(101,5000d,"Rohit"),
				new Employee(101,47000d,"Sonu"),
				new Employee(101,450d,"Raju"));
		
		
		List<Employee> collect = empList.stream().filter(emp->emp.getSalary()>50000).collect(Collectors.toList());
		
		List<String> collect2 = collect.stream().map(emp->emp.getName()).collect(Collectors.toList());
		
		
		
		
		 
//		list1 = [1,3,5], list2 = [2,4,6]
//		 OutPut: [1,2,3,4,5,6]
		int nums[]= {1,2,2,3,3,5,4,5};
		
		int n=getleastFrequesntElement(nums);
//		  Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//				 .entrySet().stream()
////				 filter(n->n.getValue()==1).
//				 .min(Comparator.comparingLong(Map.Entry::getValue)).
//				 map(Map.Entry::getKey).orElse(-1);
		   System.out.println("least frequent Element"+n);
//				 
//		
//		Node head1=new Node(1);
//		 head1.next=new Node(3);
//		 head1.next.next=new Node(5);
//		
//		 Node head2=new Node(2);
//		 head2.next=new Node(4);
//		 head2.next.next=new Node(6);
		 
		 
		 
		 
//	 List<Integer> sortedMergeList = sortedMergeList(head1,head2);
	 
//	 sortedMergeList.stream().forEach(System.out::print);
		
		
		
		

	
	}

	private static int getleastFrequesntElement(int[] nums) {

Map<Integer,Integer> mapData=new HashMap<>();
for (int i=0; i<nums.length-1; i++){
    
    mapData.put(nums[i],mapData.getOrDefault(nums[i], 0)+1);
}
for (Entry<Integer, Integer> data: mapData.entrySet()){
    if (data.getValue()==1){
        return data.getValue();
    }
}
return -1;
        
	}
}

//	private static List<Integer> sortedMergeList(Node head1, Node head2) {
//		
//		ArrayList<Integer> arr=new ArrayList<>();
//		while (head1!=null) {
//			arr.add(head1.data);
//			head1=head1.next;
//		}
//		
//		while (head2!=null) {
//			arr.add(head2.data);
//			head2=head2.next;
//		}
//		
//		
//		 Collections.sort(arr);
//		 
//		 return arr;
//				
//		
//	}
	
	
	

