package com.cbk.main.domain;

public class YourClass implements MyInterface , MyInterface2{

	public YourClass() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print(String message) {
		
		// TODO Auto-generated method stub
		System.out.println("This is Your class");
		System.out.println(MyInterface.message);
		System.out.println(MyInterface2.message);
		System.out.println("____________________");
		
	}
}
