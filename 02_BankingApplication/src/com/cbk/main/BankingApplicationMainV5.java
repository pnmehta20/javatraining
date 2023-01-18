package com.cbk.main;

import java.util.Scanner;

import com.cbk.main.domain.Account;

public class BankingApplicationMainV5 {
	public static void main(String args[]) {
		

		
		Account account = new Account(973377, "PrashanT Mehta", 1000000);
		
		
		boolean contLoop = true;
		
		do {
			
			Scanner scanner = showTransactionMenu(account);
			
			  System.out.println("Do you want to perform another transaction - Type yes ");
			  if(!scanner.next().equalsIgnoreCase("yes")  ) {
				contLoop = false ;
				System.out.println("SEE YOU SOON !!");
			  }

			
		}while (contLoop);

		
		
		
	}

	private static Scanner showTransactionMenu(Account account) {
		System.out.println("Transaction Menu ");
		System.out.println("1- Deposit  ");
		System.out.println("2- Withdrawal ");
		System.out.println("3 - Check Balance");
		System.out.println("4 - EXIT");
		
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		

		
		switch (option) {
		case 1:
			System.out.println("Please Enter Depostit Amount ");
			double depAmt = scanner.nextDouble();
			if (account.deposit(depAmt)) {
				System.out.println("Deposit is successful - Current Balance  "+account.getBalance());				
			}	
			break;
		case 2:

			System.out.println("Please Enter WIthdrowal Amount ");
			double depWith = scanner.nextDouble();
			System.out.println(account.withdraw(depWith));
			break;
		case 3:
			System.out.println("Account Balance : "  + account.getBalance());
			break;
		case 4:
			System.out.println("Account Exit");

			break;
		default:
			break;
		}
		return scanner;
	}
	
	
}
