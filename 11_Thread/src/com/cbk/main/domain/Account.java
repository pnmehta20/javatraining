package com.cbk.main.domain;

public  class Account {
	

	private double balance ;
	
	public synchronized void deposit(double amt  ) {
		System.out.println("----------------------------");
		System.out.println("Deposit start - Balance :" + balance);
		try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		balance = balance + amt;
		
		System.out.println("Deposit done - Balance :" + balance);
		
	}
	public synchronized void withdraw(double amt ) {
		System.out.println("----------------------------");
		System.out.println("Withdrwa start  - Balance :" + balance);
		if (balance - amt <=  0) {
			System.out.println("Error ");
		} else {
			balance = balance - amt ;
			System.out.println("Withdraw done  ");
		}
		System.out.println("Withdrwa done - Balance :" + balance);

	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

//	public Account( double balance) {
//		super();
//		this.balance = balance;
//	}


}
