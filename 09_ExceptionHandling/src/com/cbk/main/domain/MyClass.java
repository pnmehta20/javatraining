package com.cbk.main.domain;

import java.util.Scanner;

public class MyClass  {

	private  double num1;
	private  double num2;
	private  double result;

	public void accept(double num1 ,double  num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	public void caclulate() {
		result = this.num1 /this.num2;
		
	}
	public void display() {
		System.out.println("Result is " + result);
		
	}
	public void scan(Scanner scanner) {
		System.out.println("Result is " + result);
		System.out.println(scanner.next());
		
	}
	public MyClass() {
		// TODO Auto-generated constructor stub
	}

}
