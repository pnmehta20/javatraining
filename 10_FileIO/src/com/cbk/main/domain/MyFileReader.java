package com.cbk.main.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {

	
	private char[] data;
	private int length;
	private File file ;
	private Reader reader;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	public MyFileReader(File file, Reader reader) {
		super();
		this.file = file;
		this.reader = reader;
	}
	
	public MyFileReader( BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}
	
	public String readfile() {
		
		try {
//			data = new char[(int) file.length()];
			data = new char[5];
			reader.read(data);
			return new String(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error ";
		
	}
	public String readfilelbl() {
		
		try {

			
			bufferedReader.readLine().isEmpty();
			
			
			System.out.println("file.getAbsolutePath()" + file.getAbsolutePath());
			do {
				String data1 = bufferedReader.readLine();
				
				System.out.println(data1);
				
			}while(!bufferedReader.readLine().isBlank());
			
			
			String data1 = bufferedReader.readLine();
			System.out.println(data1);
			return data1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return "";
		
	}
	
}
