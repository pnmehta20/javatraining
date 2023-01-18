package com.cbk.main;

import com.cbk.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start ");

		MyClass class1  = new MyClass(10,5);
		MyClass class2  = new MyClass();
		class1.show();
		System.out.println("---------- ");

		new MyClass("PPP").show();
		System.out.println("Main End ");
		
		
	}

}
