package com.cbk.main;

import java.util.Scanner;

import com.cbk.main.domain.MyClass;
import com.cbk.main.domain.MyInterface;
import com.cbk.main.factorty.Myfactory;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MyClass myClass = new MyClass();
//		myClass.print("print 1 ");

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. MyClass Object ");
		System.out.println("2. Yourclass Object");
		System.out.println("Enter Your choice");
		int choice = scanner.nextInt();
		
		Myfactory myfactory  = new Myfactory();
		
//		MyInterface myInterface = Myfactory.getObject(choice);
		
		MyInterface myInterface = myfactory.getObject(choice);
		
		myInterface.print("ppp");
		
		
		
		
	}

}
