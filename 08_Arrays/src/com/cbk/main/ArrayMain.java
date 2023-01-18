package com.cbk.main;

import java.util.List;
import java.util.Scanner;

import com.cbk.main.domain.Employee;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] numbers = new int[5];
//		numbers[0] = 0;
//		for (int i = 1; i < 5; i++) {
//			numbers[i] = numbers[i-1] + 10;
//		}
//
//		for (int p : numbers) {
//			System.out.println(p);
//
//			System.out.println(numbers.length);
//		}
		int empld =0;
		Scanner scanner = new Scanner(System.in);
		 
		
		Employee [] empl = new Employee[2]   ;
		Employee e1 =  new Employee(empld, null, empld);
		for (int i = 0; i < empl.length; i++) {

		System.out.println("Enter Employee ID ");
		  e1.setEmplyeeId(scanner.nextInt());;
		System.out.println("Enter Employee Name  ");
		e1.setName(scanner.next());;
		System.out.println("Enter Employee Salary  ");
		e1.setSalary(scanner.nextInt());;
			empld = empld + 100;

			empl[i] =new Employee(e1.getEmplyeeId(),e1.getName(),e1.getSalary());
		
		}

		for (Employee p :empl) {
			System.out.println(p.toString());

		}
		

	}

}
