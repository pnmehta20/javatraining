package com.cbk.main.domain;

public class Circle extends Shapes {

	public Circle() {
		// TODO Auto-generated constructor stub
//		super(10);
		System.out.println("Default constructor - Circle ");
	}

	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
//		super.draw();
		
		System.out.println("This is Circle Draw");
		print();
	}

	
	public void print() {
		System.out.println("This is circle print method");
	}
	
	
	
}
