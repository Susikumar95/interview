package com.string;

public class StringEquals {

	public static void main(String[] args) {
		
	
	
	String s1="Susi";
	String s2="Susi";
	
	
	
	String s3=new String("Susi");
	
	
	
	if(s1==s2) {
		
		System.out.println("S1 and s2 are equal");
		
		
	}
	
	else
	{
		System.out.println("S1 and s2 are notequal");
			
	}
	
	if(s1==s3) {
		
		System.out.println("S1 and s3 are equal");
	}
	
	else {
		
		System.out.println("S1 and s3 are notequal");
	}
}

}
