package com.DSA.program.misc;

public class Pattern {
	
//	Pseudocode for printing this pattern
//	Pass a param n & print this pattern. In the case below, n = 5
//
//	*
//	* *
//	* * *
//	* * * *
//	* * * * *
//	* * * *
//	* * *
//	* *
//	*
	
	public static void main(String[] args) {
		
		int n=5;
		for (int i=1; i<=n; i++) {
			
			
			for (int j=1; j<=i; j++) {
				System.out.println("* ");
				
			}
		}
		
		
		
	}
	
	
	
	

}
