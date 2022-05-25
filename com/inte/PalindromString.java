package com.inte;

public class PalindromString {

	public static void main(String[] args) {
		String s1="Radar";
		String Rev="";
		
		for (int i=s1.length()-1; i>=0; i--) {
			char charAt = s1.charAt(i);
			
			Rev=Rev+charAt;
			
			System.out.print(charAt);
		}
		
	
		if(Rev.equalsIgnoreCase(s1)) {
	System.out.println("String is palindrom");		
		}
			
		else {
			System.out.println("not palindrom");
		}	
		}
	
}
