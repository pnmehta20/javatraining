package com.cbk.main.factorty;

import com.cbk.main.domain.MyClass;
import com.cbk.main.domain.MyInterface;
import com.cbk.main.domain.YourClass;

public class Myfactory {

	public Myfactory() {
		// TODO Auto-generated constructor stub
	}

	public static MyInterface getObject(int choice) {
		if(choice == 1) {
			return new MyClass();
		}
		if (choice == 2) {
			return new YourClass();
		}
			
		return null;
		
	}
}
