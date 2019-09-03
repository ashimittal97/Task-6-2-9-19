package com.worldpay.IoTask;

import java.io.*;
import java.util.Scanner;

public class FileSplit {

static byte[] b=new byte[100];
  static Scanner sc=new Scanner(System.in);
//static String file=sc.next();
private static FileInputStream fis;
static int a;
private static FileOutputStream fos;
private static FileOutputStream fos1;
private static FileOutputStream fos2;
private static FileOutputStream fos3;
private static int split;
private static int length;
private static Object File;
private static java.io.File f1;



public static void main(String[] args) throws Exception {
System.out.println("Enter Your File Name");
String file=sc.next();
System.out.println("IN HOW MANY PARTS YOU WANT TO SPLIT");
split = sc.nextInt();
File f = new File("f:/"+file+".txt");
   	fis = new FileInputStream(f);
   	int x=fis.available();
   	length = fis.available();
   	System.out.println(x);
   	int j=1;
if(f.exists()){
x=x/split;
 int i=0;
for(i=1;i<length;i++)
{
File fi = new File("f:/"+file+"f"+j);
fos = new FileOutputStream(fi);
a = fis.read(b,i,x);
fos.write(b,i,x);
i=x;
j++;
length=length-x;
 }
System.out.println("File Splitted");
}
else
System.out.println("THE FILE YOU ENTERED DOESNOT EXIST");



fis.close();
fos.close();



}

}


