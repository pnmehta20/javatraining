package com.cbk.main.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class MyFileMetadata  {
 
	private String path = "C:/JavaTraning/TEXT1.txt";
	public void printFIle() throws IOException {
		File file = new File(path);
		
	
		if (file.exists()) {
			System.out.println("File Name :" + file.getName());
			System.out.println("File Path :" + file.getAbsolutePath());
			System.out.println("File Size:" + file.length());
			System.out.println("File Open :" + file.canExecute());
			System.out.println("File write :" + file.canWrite());
			System.out.println("File Read :" + file.canRead());
//			Date date = new Date(file.lastModified());
			System.out.println("File Modified :" +new Date(file.lastModified()));
			
//			
//			BufferedReader br  = new BufferedReader(new FileReader(file));
//			System.out.println(br.readLine());
		
			
		}
		else  {
			System.out.println("file is not available ");
		}
	}
	
}
