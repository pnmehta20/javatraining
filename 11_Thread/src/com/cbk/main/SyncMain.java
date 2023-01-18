package com.cbk.main;

import com.cbk.main.domain.MyThread;
import com.cbk.main.domain.Resource;

public class SyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Resource resource = new Resource();
//		resource.message("Hi ");
//		resource.message("Hello ");
//		resource.message("How are you doin bro  ");
		
		Resource resource = new Resource();
		
		MyThread myThreadOne = new MyThread(resource, "Hi");
		Thread thread1 = new Thread(myThreadOne);
		
		
		MyThread myThreadTwo = new MyThread(resource, "Hello");
		Thread thread2 = new Thread(myThreadTwo);
		
		
		MyThread myThreadThree = new MyThread(resource, "How are you !");
		Thread thread3 = new Thread(myThreadThree);
		
		thread1.start();
		thread1.setPriority(1);
		thread2.start();
		thread2.setPriority(9);
		thread3.start();
		thread3.setPriority(5);
	}

}
