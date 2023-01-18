package com.cbk.main;

import java.util.Scanner;

import com.cbk.main.domain.Account;
import com.cbk.main.domain.Savings;

public class BankingApplicationMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Account Menu");
		System.out.println("1. Saving");
		System.out.println("2. Current");
		
		int option = scanner.nextInt();
		
		
		Account account = getAccount(option, scanner);
		

		
	}

	public static Account getAccount(int i , Scanner scanner){

		switch (i) {
		case 1:
			System.out.println("is This salary account - Press 1 ");
			if (scanner.nextInt()== 1)
			    return new Savings(100, "Prashant mehta", 0, true );
			else 
				return new Savings(100, "Prashant mehta", 0, false );
		case 2:

			 return new Savings(100, "Prashant mehta", 0, true );
		default:
			break;
		}
		return null;
	}

}
