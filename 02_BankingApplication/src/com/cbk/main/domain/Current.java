package com.cbk.main.domain;

public class Current extends Account {

	private double overdraftBal;
	private double overdraftLim;
	

	public Current() {
		// TODO Auto-generated constructor stub
	}

	public Current(int accNbr, String name, double balance, double overdraftBal) {
		super(accNbr, name, balance);
		this.overdraftBal = overdraftBal;
		this.overdraftLim = overdraftBal;
	}

	public double getoverdraftBal() {
		return overdraftBal;
	}

	public void setoverdraftBal(double overdraftBal) {
		this.overdraftBal = overdraftBal;
	}

	@Override
	public String withdraw(double withAmount) {
		// TODO Auto-generated method stub
		System.out.println("Trasanction Amt :" + withAmount);
		if (getBalance() + overdraftBal >= withAmount) {
			if (getBalance() - withAmount > 0 ) {
				return super.withdraw(withAmount) + (" OverDraft Balance :"+ overdraftBal);
				
			}else {
				overdraftBal =overdraftBal-( withAmount - getBalance());
				return super.withdraw(getBalance()) +  (" OverDraft Balance :"+ overdraftBal);				
			}
		} else {
			return "Please Increase the Overdraft Limit ";
		}

	}

	@Override
	public boolean deposit(double depAmount) {
		// TODO Auto-generated method stub
		
		double balToOd = overdraftLim - overdraftBal;
		if (depAmount > 0 ) { 
			if (balToOd > 0 && depAmount <= balToOd  ) {
				overdraftBal = overdraftBal + depAmount;				
			}else 
			if (balToOd > 0 && depAmount > balToOd  ) {
				overdraftBal = overdraftLim;				
				super.deposit(depAmount - balToOd );
			}else {
				super.deposit(depAmount); 
			}
			
			System.out.print("Deposit Successfully   :");
			System.out.println("Current Balance: "+ super.getBalance() + " OverDraft Balance :"+ overdraftBal);
			return true;
		}else {
			System.out.print("Deposit faile , please try again ");
			return false; 
		}
//		return super.deposit(depAmount);
	}

}
