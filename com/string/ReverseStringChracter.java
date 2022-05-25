package com.string;

public class ReverseStringChracter
{

	
	public static void main(String[] args) {
		
		
		String s1="Susi";			
		
		for (int i=s1.length()-1; i>=0; i--) {
			
			char charAt = s1.charAt(i);
			
			System.out.print(charAt);
		}
		
	
	}
}
