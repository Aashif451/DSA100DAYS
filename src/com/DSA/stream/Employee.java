package com.DSA.stream;

public class Employee {
		@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
		private int id ;
		private double salary;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getSalary() {
			return salary;
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
		public Employee(int id, double salary, String name) {
			super();
			this.id = id;
			this.salary = salary;
			this.name = name;
		}
	
		
		
		
			

	
	


}
