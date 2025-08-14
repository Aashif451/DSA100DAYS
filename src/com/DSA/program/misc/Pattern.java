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
				System.out.print("*");
				
			}
			System.out.print(" ");
		}
		for(int i=n-1; i>0; i--) {
			
			for (int j=1; j<=i; j++) {
				System.out.println("*");
				
			}
			
			System.out.println(" ");
		}
		
		
		
	}
//	
//	Employee(id, name, email, mobile)
//	Address (id, employeeId, address1, city, state)
//	Need a query to get list of unique cities & the number of employees in each city
////	
//	
//	select add.city, count(distinct a.employeeId) AS empCount
//	from Address add groupby(add.city) order by empCount desc;
	
	

}
