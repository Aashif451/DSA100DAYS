package com.DSA.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListProblemWithStream {
	
	
	public static void main(String[] args) {
//		Merge two sorted linked lists into one sorted list.
		 
//		list1 = [1,3,5], list2 = [2,4,6]
//		 OutPut: [1,2,3,4,5,6]
		
		Node head1=new Node(1);
		 head1.next=new Node(3);
		 head1.next.next=new Node(5);
		
		 Node head2=new Node(2);
		 head2.next=new Node(4);
		 head2.next.next=new Node(6);
		 
		 
	 List<Integer> sortedMergeList = sortedMergeList(head1,head2);
	 
	 sortedMergeList.stream().forEach(System.out::print);
		
		
		
		

	
	}

	private static List<Integer> sortedMergeList(Node head1, Node head2) {
		
		ArrayList<Integer> arr=new ArrayList<>();
		while (head1!=null) {
			arr.add(head1.data);
			head1=head1.next;
		}
		
		while (head2!=null) {
			arr.add(head2.data);
			head2=head2.next;
		}
		
		
		 Collections.sort(arr);
		 
		 return arr;
				
		
	}
	
	
	
}
