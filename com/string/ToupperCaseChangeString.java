package com.string;

public class ToupperCaseChangeString {

	
	public static void main(String[] args) {
		
		String s1="today is monday";
		
		String s2=" ";
		
		char charAt = s1.charAt(0);
		
		
		s2=charAt+s2;
		
		
		String upperCase = s2.toUpperCase();
		
		System.out.println(upperCase);
		
		
		
		
		for (int i = 1; i <s1.length(); i++) {
			
			
		char charAt2 = s1.charAt(i);
			
			
		upperCase=upperCase+charAt2; 
			
			
		}
		
		System.out.println(upperCase);
		
		
		 String noSpaceStr = upperCase.replaceAll("\\s", ""); // using built in method  
	        System.out.println(noSpaceStr);  
		
		
		
	}
}
