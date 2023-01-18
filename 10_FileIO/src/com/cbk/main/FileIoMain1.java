package com.cbk.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import com.cbk.main.domain.MyFileReader;

public class FileIoMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String path = "C:\\JavaTraning\\text2.txt";
		File file = new File(path);
		Reader reader;
		try {
			reader = new FileReader(file);
			System.out.println(file.getAbsolutePath());

//			MyFileReader myFileReader = new MyFileReader(file, reader);
//			System.out.println(myFileReader.readfile());
//			System.out.println(myFileReader.readfile());
			MyFileReader myFileReader2 = new MyFileReader(new BufferedReader(reader)) ;
			
			
			System.out.println	(myFileReader2.readfilelbl());
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
