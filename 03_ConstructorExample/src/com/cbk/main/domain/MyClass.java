package com.cbk.main.domain;

public class MyClass {

	int p = 2;

	public MyClass() {
		System.out.println("Default constructor of myclass :" + p);

	}
 
	public MyClass(int i , int p ) {
		System.out.println("int constructor of myclass :" + (i + p));

	}
	
	public MyClass(String s ) {
		System.out.println("String PARAM :" + s);
		show(20);
	}
	
	public void show() {
		System.out.println("Hi ");
	}
	
	public void show(int i ) {
		System.out.println("Hi " + i );
	}

}
