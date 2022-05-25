package com.string;

import java.util.Scanner;

public class StringMethods {
public static void main(String[] args) {
	
	
	String s1="cvbn";
	String s2="SusiKumar masilamani jdfcj";
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter string");

	String S3 = s.nextLine();
	
	//to change Lower case
	String lowerCase = S3.toLowerCase();
	System.out.println(lowerCase);
	
	
	//to check empty
	boolean contains2 = s1.isEmpty();
	System.out.println("is Empty"+ contains2);
	
	
	//to check contains
	boolean contains = s1.contains("susi");
	System.out.println(contains);
	
	//to check equals
	boolean equals = s1.equals(s2);
	System.out.println(equals);
	
	
	//checking equals by ignoring equals ignore
	boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
	System.out.println(equalsIgnoreCase);
	
	//finding lenghth
	int l = s1.length();
	System.out.println(l);
	
	//finding index
	int indexOfl = s1.indexOf('f');
	System.out.print(indexOfl);
	
	//finding character
	char charAt = s1.charAt(0);
	System.out.println(charAt);
}
}
