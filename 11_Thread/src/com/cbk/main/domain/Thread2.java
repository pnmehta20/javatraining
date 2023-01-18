package com.cbk.main.domain;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("        Thread 2:" + i);			
		}
		

		
	}

}
