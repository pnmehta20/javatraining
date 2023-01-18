package com.cbk.main.domain;

public class Resource {

	public synchronized void message(String textmessage) {
		// TODO Auto-generated constructor stub
		
		System.out.print("[");
		System.out.print(textmessage);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
		
	}

}
