package com.gmail.file;

import java.io.File;
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
	}

}
