package com.cbk.main.domain;

public class Savings extends Account {
	boolean isSalary ;
	
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	public Savings(int accNbr, String name, double balance, boolean isSalary) {
		super(accNbr, name, balance);
		this.isSalary = isSalary;
	}
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

}
