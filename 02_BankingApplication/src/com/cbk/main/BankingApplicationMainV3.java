package com.cbk.main;

import com.cbk.main.domain.Account;
import com.cbk.main.domain.Savings;

public class BankingApplicationMainV3 {
public static void main(String args[]) {
		
		Account ac1 = new  Account();
		
		ac1.setAccNbr(123);
		Account ac2 = ac1;
	
		
		System.out.println(ac2.getAccNbr());
		
		ac2.setAccNbr(345);
		
		System.out.println(ac1.getAccNbr());
ac1.setAccNbr(3456);
		
		System.out.println(ac2.getAccNbr());
		 
	
		Savings savings = new Savings();
		savings.getBalance();
		
		
		}
}
