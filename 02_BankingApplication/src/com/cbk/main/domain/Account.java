package com.cbk.main.domain;

 abstract class Account {
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNbr, String name, double balance) {
		// TODO Auto-generated constructor stub
		setAccNbr(accNbr);
		setName(name);
		setBalance(balance);

		System.out.println("Below account is opened Successfully ");
		System.out.println("Account Number " + getAccNbr());
		System.out.println("Account Name " + getName());
		System.out.println("Account Balance " + getBalance());

	}

	private int accNbr;
	private String name;
	private double balance;

	public   String withdraw(double withAmount) {

		if (withAmount <= 0) {
			return "WithDraw Error  - Please input positive amount ";
		} else if (balance >= withAmount) {
			this.balance = this.balance - withAmount;
			return "WithDraw Successfully : Current Balance : " + this.balance;
		} else {
			return "WithDraw error -Please maintain Sufficient Amount  ";
		}

	}

	public boolean deposit(double depAmount) {
		boolean ind = false;
		if (depAmount > 0) {
			this.balance = this.balance + depAmount;
			ind = true;
		}
		return ind;

	}

	public int getAccNbr() {
		return accNbr;
	}

	public void setAccNbr(int accNbr) {
		this.accNbr = accNbr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
