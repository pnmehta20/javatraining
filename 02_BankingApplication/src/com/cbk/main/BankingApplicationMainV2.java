package com.cbk.main;

import java.util.Scanner;

import com.cbk.main.domain.Account;

public class BankingApplicationMainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to XYZ bank ");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input Account Nbr  ");
		int accountNumber = scanner.nextInt();

		System.out.println("Enter Name  ");
		String accountName = scanner.next();

		System.out.println("Enter balance  ");
		double balance = scanner.nextDouble();

		Account account = new Account();
		account.setAccNbr(accountNumber);
		account.setBalance(balance);
		account.setName(accountName);

		System.out.println("Below account is opened Successfully ");
		System.out.println("Account Number " + account.getAccNbr());
		System.out.println("Account Name " + account.getName());
		System.out.println("Account Balance " + account.getBalance());

	}

}
