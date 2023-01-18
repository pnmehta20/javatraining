package com.cbk.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cbk.main.domain.MyClass;

public class ExceptionHandingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Starts");
		
		MyClass myClass = new MyClass();
		
		Scanner scanner = new Scanner(System.in);
		

		try {
			myClass.accept(scanner.nextInt(), scanner.nextInt());
			myClass.caclulate();
			 myClass.display();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("InputMismatchException");
		}
		 catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
		} finally {
			System.out.println("Finally ");
		}

		 myClass.scan(scanner);
			System.out.println("main Ends");

	}
	
	
	

}
