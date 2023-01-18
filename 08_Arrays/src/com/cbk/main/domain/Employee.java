package com.cbk.main.domain;

public class Employee {

	private int emplyeeId;
	private String name;
	private double salary;
	public Employee(int emplyeeId, String name, double salary) {
		super();
		this.emplyeeId = emplyeeId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmplyeeId() {
		return emplyeeId;
	}
	public void setEmplyeeId(int emplyeeId) {
		this.emplyeeId = emplyeeId;
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

	public String toString() {
		
		return "Employee name :" + name + " ID : " + emplyeeId + " salary  :" + salary ;
		
	}
}
