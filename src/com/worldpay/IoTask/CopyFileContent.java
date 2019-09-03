package com.worldpay.IoTask;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileContent {
	
	            public static void main(String args[])throws IOException 
	       { 
	             FileInputStream Fread =new FileInputStream("F:/java/file1.txt"); 
	             FileOutputStream Fwrite=new FileOutputStream("F:/java/file2.txt") ; 
	             System.out.println("File  content is Copied"); 
	             int c; 
	             while((c=Fread.read())!=-1) 
	             Fwrite.write((char)c); 
	             Fread.close(); 
	             Fwrite.close(); 
	        } 
	} 

