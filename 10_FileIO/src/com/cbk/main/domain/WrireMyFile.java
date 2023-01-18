package com.cbk.main.domain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WrireMyFile {

	private File file;
	private OutputStream outputstream;
//	private FileOutputStream fileoutputstream;
	private String outMessage;
	
	public WrireMyFile(File file, OutputStream outputstream, String outMessage) {
		super();
		this.file = file;
		this.outputstream = outputstream;
		this.outMessage = outMessage;
//		this.fileoutputstream = fileoutputstream;
	}
	
	public boolean writeFile() {
		
		try {
			outputstream.write(outMessage.getBytes());
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file Closing error !!");
		}
		return false;
	}

	public boolean closefile() {
		
				try {
					outputstream.close();
				} catch (IOException e) {
					// TODO Auto-generated 
					System.out.println("file Closing error !!");
				}
				return false;
		
	}
}
