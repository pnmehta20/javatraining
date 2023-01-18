package com.cbk.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadMyFile {

//	private String path = "C:/JavaTraning/TEXT1.txt";
	
	private String path = "C:/JavaTraning/image1.jpg";

	private InputStream inputStream;

	private byte[] data ;
	public void readfile() {
		try {
			
			File file = new File(path);
			data =  new byte[(int) file.length()];
			System.out.println((int) file.length());
			inputStream = new FileInputStream(path);
			
//			inputStream.read(data);
			System.out.println(new String(data));
//			return new String(data);
//			for (byte b : data) {
//				System.out.print((char)b);
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
