package com.worldpay.IoTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Delete {
	public static void main(String args[]) throws Exception {
	File f=new File("F:\\java\\adi.txt");
	BufferedReader bt = new BufferedReader(new FileReader(f));
	String st;
	while((st=bt.readLine())!=null){
		System.out.println(st);
		//System.out.println("Line--- " + line);
        
	}
	bt.close();
	 Path path 
     = Paths.get("F:\\java\\adi.txt"); 

	if(Files.deleteIfExists(path)){
		System.out.println("file deleted");
	}
}
}
