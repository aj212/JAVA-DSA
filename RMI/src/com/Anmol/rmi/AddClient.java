package com.Anmol.rmi;

import java.rmi.*;
import java.net.*;
import java.util.*;
import java.io.*;
public class AddClient {
  public static void main(String[] args) {
	String host="localhost";
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1st no.");
	int a =s.nextInt();
	System.out.println("Enter 2nd no.");
	int b=s.nextInt();
	try {
		AddRem remobj=(AddRem).Naming.lookup("rmi://"+host"/AddRem");
	}
}
}
