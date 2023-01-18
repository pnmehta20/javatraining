package com.cbk.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.cbk.main.domain.MyFileMetadata;
import com.cbk.main.domain.ReadMyFile;
import com.cbk.main.domain.WrireMyFile;

public class FIleIOMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		MyFileMetadata fileio = new MyFileMetadata();
		fileio.printFIle();
		
		ReadMyFile readMyFile = new ReadMyFile();
		
		
		String path = "C:/JavaTraning/text2.txt";
		File file = new File(path);
		OutputStream outputstream = new FileOutputStream(file , true);
//		FileOutputStream fileoutputstream = new FileOutputStream(file)
		readMyFile.readfile();
		String data1 = new String();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			String st = scanner.next();
			WrireMyFile wrireMyFile = new WrireMyFile(file, outputstream ,st  );
	    	wrireMyFile.writeFile();
		}
		


	}

}
