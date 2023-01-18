package com.cbk.main.domain;

public abstract class Account {

	private int accNbr;

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

	private String name;
	private double balance;



	public abstract void withdraw();

	public Account(int accNbr, String name, double balance) {
	super();
	this.accNbr = accNbr;
	this.name = name;
	this.balance = balance;
	System.out.println("Below account is opened Successfully ");
	System.out.println("Account Number " + getAccNbr());
	System.out.println("Account Name " + getName());
	System.out.println("Account Balance " + getBalance());
}

	public abstract void deposit();

}
