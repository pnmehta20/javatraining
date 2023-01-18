package com.cbk.main.domain;

public class Thread1 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread 1 : " + i);			
		}
		
	}

}
