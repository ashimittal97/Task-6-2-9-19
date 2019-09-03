package com.worldpay.IoTask;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class MergeContentSequence {
	public static void main(String[] args) throws IOException {
		 FileInputStream fistream1 = new FileInputStream("F:/java/f1.txt"); 
		   FileInputStream fistream2 = new FileInputStream("F:/java/f2.txt"); 

		   SequenceInputStream sistream = new SequenceInputStream(fistream1, fistream2);  
		   FileOutputStream fostream = new FileOutputStream("F:/java/Merge.txt");   

		   int temp;
		   System.out.println("Now file content is:");
		   while( ( temp = sistream.read() ) != -1)
		   {
		     System.out.print( (char) temp );
		     fostream.write(temp);
		   }
		   fostream.close();
		   sistream.close();
		   fistream1.close();
		   fistream2.close();
		  }


}
