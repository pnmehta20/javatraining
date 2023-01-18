package com.cbk.main;

import java.util.Scanner;

import com.cbk.main.domain.Savings;

public class BankingApplicationMainV6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Savings savings = new Savings(973377, "PrashanT Mehta",2000,  true );
		
		boolean contLoop = true;
		
		do {
			
			Scanner scanner = showTransactionMenu(savings);
			
			  System.out.println("Do you want to perform another transaction - Type yes ");
			  if(!scanner.next().equalsIgnoreCase("yes")  ) {
				contLoop = false ;
				System.out.println("SEE YOU SOON !!");
			  }

			
		}while (contLoop);

		
		
		
	}

	private static Scanner showTransactionMenu(Savings savings) {
		System.out.println("Transaction Menu ");
		System.out.println("1- Deposit  ");
		System.out.println("2- Withdrawal ");
		System.out.println("3 - Check Balance");
		
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		

		
		switch (option) {
		case 1:
			System.out.println("Please Enter Depostit Amount ");
			double depAmt = scanner.nextDouble();
			if (savings.deposit(depAmt)) {
				System.out.println("Deposit is successful - Current Balance  "+savings.getBalance());				
			}	
			break;
		case 2:

			System.out.println("Please Enter WIthdrowal Amount ");
			double depWith = scanner.nextDouble();
			System.out.println(savings.withdraw(depWith));
			break;
		case 3:
			System.out.println("savings Balance : "  + savings.getBalance());
			break;
		case 4:
			System.out.println("savings Exit");
			
			break;
		default:
			break;
		}
		return scanner;
	}

	}


