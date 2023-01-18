package com.cbk.main;

import com.cbk.main.domain.Account;

public class BankingApplicationMain {
	
	public static void main(String args[]) {
		
		Account ac1 = new  Account();
		
		ac1.setAccNbr(101);
		ac1.deposit(-123.50);
		
		System.out.println(ac1.getAccNbr());
		System.out.println(ac1.getBalance());
		
		
		System.out.println(ac1.withdraw(100));
		System.out.println(ac1.withdraw(150));
		System.out.println(ac1.withdraw(-1));
		System.out.println(ac1.withdraw(0));
		
		
		
		
	}

}
