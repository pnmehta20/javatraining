package com.cbk.main.domain;

public class Savings extends Account {

	public Savings() {
		// TODO Auto-generated constructor stub
	}
	
	public Savings(int accNbr, String name, double balance, boolean isSalary) {
		super(accNbr, name, balance);
		this.isSalary = isSalary;
	}

	boolean isSalary ;

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
  
	@Override
	public String withdraw(double withAmount) {
		// TODO Auto-generated method stub
		if((isSalary && (getBalance()-withAmount) >=0) 
				|| ((getBalance()-withAmount) >=1500))
		{
			return super.withdraw(withAmount);
		}
		else
			return "insufficent balance";
			
	}
	
	
	
}
