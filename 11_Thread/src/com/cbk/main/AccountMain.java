package com.cbk.main;

import com.cbk.main.domain.Account;
import com.cbk.main.domain.MyThread;
import com.cbk.main.domain.MyThreadAcc;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account account = new Account();

		MyThreadAcc deposit1 = new MyThreadAcc(account, 1500.00, 2);
		Thread thread1 = new Thread(deposit1);
		thread1.start();
		
		MyThreadAcc withdraw1 = new MyThreadAcc(account, 2000.00, 1);
		Thread thread3 = new Thread(withdraw1);
		thread3.start();

		MyThreadAcc deposit2 = new MyThreadAcc(account, 2000.00, 2);
		Thread thread2 = new Thread(deposit2);
		thread2.start();

		

	}

}
