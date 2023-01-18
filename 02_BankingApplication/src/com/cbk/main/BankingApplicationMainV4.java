package com.cbk.main;

import java.util.Currency;

import com.cbk.main.domain.Current;

public class BankingApplicationMainV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Current current = new Current(101, "Prashant Mehta", 10000, 5000);
		System.out.println(current.withdraw(5000.00));
		System.out.println(current.withdraw(6000.00));
		System.out.println(current.withdraw(5000.00));
		current.deposit(3000);
		
		
		System.out.println(current.withdraw(1500.00));
		System.out.println(current.withdraw(1000.00));
		System.out.println(current.withdraw(4000.00));
		System.out.println(current.withdraw(600.00));

		
		

		
	}

}
