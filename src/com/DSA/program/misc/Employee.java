package com.DSA.program.misc;

public class Employee {
	
	private Long id;
	private String name ;
	private double salary;
	private String depatmentName;
	
	
	
	public String getDepatmentName() {
		return depatmentName;
	}
	public void setDepatmentName(String depatmentName) {
		this.depatmentName = depatmentName;
	}
	public Employee(Long id, String name, double salary, String depatmentName) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.depatmentName = depatmentName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	

}
