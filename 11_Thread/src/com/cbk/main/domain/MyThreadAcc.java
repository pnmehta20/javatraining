package com.cbk.main.domain;
public class MyThreadAcc implements Runnable {

	Account account ;
	Double balance;
	int choice;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (choice ==1) {
			account.withdraw(balance);
		}if (choice == 2)
		{
			account.deposit(balance);
		}
//		System.out.println("balance : "	 + 	account.getBalance());
		
	}

	public MyThreadAcc(Account account, Double balance, int choice) {
		super();
		this.account = account;
		this.balance = balance;
		this.choice = choice;
	}
	
	

	
}
