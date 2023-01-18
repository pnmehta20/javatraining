package com.cbk.main.domain;

public class Shapes {

	public Shapes() {
		// TODO Auto-generated constructor stub
		
		System.out.println("default constructor- Shape");
	}

	public Shapes(int size ) {

		System.out.println("param constructot - Shapes ");
		System.out.println("SIZE " + size);
	}
	public void draw()  {
		
		System.out.println("drawing shapes");

	}
	
	public void print() {
		System.out.println("This is Shape print method");
	}

}
