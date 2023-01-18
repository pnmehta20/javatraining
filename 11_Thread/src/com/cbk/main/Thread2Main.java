package com.cbk.main;

import com.cbk.main.domain.Thread1;
import com.cbk.main.domain.Thread2;

public class Thread2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main start ");
		
		Thread1 thread1 = new  Thread1();
	     thread1.start();
		
		Thread2 thread2 = new Thread2();
		Thread thread = new Thread(thread2);
		thread.start();
		thread.start();
//		try {
//			thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
//		try {
//			thread.sleep(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		System.out.println("main Ends ");
		

	}

}
