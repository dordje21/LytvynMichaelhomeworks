package com.gmail.file;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File in = new File("/Users/Michael/Desktop/jackson/8.png");
		File out = new File("img.png");
		try {
			FileOperator.fileCopy(in, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File folder = new File("/Users/Michael/Desktop/");
		System.out.println(FileOperator.calculateFolderSize(folder));
		
		
		try(DataOutputStream f = new DataOutputStream(new FileOutputStream("b.dat"))){
			f.writeInt(12);
		} catch (Exception e) {
			System.out.println("file write error");
		}
	}
	
	

}
