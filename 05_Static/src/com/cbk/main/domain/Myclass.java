	package com.cbk.main.domain;

public class Myclass {

	public int num1 = 10 ;
	public static int num2 = 10 ;

	public Myclass() {
		// TODO Auto-generated constructor stub
	System.out.println("cons");
		
	}
	
	public void display(){
		System.out.println(num1 );
		System.out.println(num2 );
		
		num1 = num1 + 10 ;		num2 = num2 + 10 ;
		
		System.out.println(num1 );
		System.out.println(num2 );
	}

	public static void display1() {
		System.out.println(num2 );
		
		num2 = num2 + 10 ;
		
		System.out.println(num2 );
	}
	
	static {
		System.out.println("Static block 1");
	}
	static {
		System.out.println("Static block 2 ");
	}
	{
		System.out.println("non- Static block1 ");
	}
	
	
	
}
