package com.cbk.main.domain;

public class MyThread implements Runnable {

	public Resource resource;
	public String textmessage;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		resource.message(textmessage);
		
	}

	public MyThread(Resource resource, String message) {
		super();
		this.resource = resource;
		this.textmessage = message;
	}
	
	

}
