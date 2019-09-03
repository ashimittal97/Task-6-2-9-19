package com.worldpay.IoTask;

import java.io.*;
import java.util.Scanner;

public class Emp implements Serializable{
int eno,sal;
   String ename,dept,desig;
   public static void main(String[] args) throws IOException  {
   System.out.println("Please Enter employee details: ");
   System.out.println("Enter Employee Number");
   Scanner sc=new Scanner(System.in);
   int enumber=sc.nextInt();
   System.out.println("Enter Employee Name");
   String ename=sc.next();
   System.out.println("Enter Employee salary");
   int sal=sc.nextInt();
   System.out.println("Enter Employee Department");
   String dept=sc.next();
   System.out.println("Enter Employee Designation");
   String desig=sc.next();
   Emp emp=new Emp(enumber,ename,sal,dept,desig);
  try {
FileOutputStream f = new FileOutputStream(new File("F:/java/EmployeeDetail.txt"));
ObjectOutputStream o = new ObjectOutputStream(f);
o.writeObject(emp);
o.close();
f.close();

FileInputStream fi = new FileInputStream(new File("F:/java/EmployeeDetail.txt"));
ObjectInputStream oi = new ObjectInputStream(fi);
Emp empobj = (Emp)oi.readObject();

System.out.println("Employee Detail is "+empobj.eno+","+empobj.ename+","+empobj.sal+","+empobj.dept+","+empobj.desig);
oi.close();
fi.close();
} catch (ClassNotFoundException e) {
System.out.println("Class Not found");
}
}
    public Emp(int eno,String ename,int salary, String department, String designation) {

this.eno = eno;
this.sal = salary;
this.ename = ename;
this.dept=department;
this.desig = designation;
}

    
}
