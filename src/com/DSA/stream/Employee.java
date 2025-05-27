package com.DSA.stream;

public class Employee {
		private int id ;
		private double salary;
		private String name;
		private String department ;
		private int age;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getSalary() {
			return salary;
		}
		public Employee(int id, double salary, String name, String department, int age) {
			super();
			this.id = id;
			this.salary = salary;
			this.name = name;
			this.department = department;
			this.age = age;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
			

	
	


}
