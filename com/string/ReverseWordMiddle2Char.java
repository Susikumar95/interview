package com.string;

public class ReverseWordMiddle2Char {

	public static void main(String[] args) {

		String s1= "my name susikumar going";
		String s2[] = s1.split(" ");
			int i;
			
		for ( i=s2.length-1; i>=0; i--) {	
				
			
			if(i==1)
			{
				String s3=s2[1];	
				
				for (int i1=s3.length()-1; i1>=0; i1--) {
					char charAt = s3.charAt(i1);				
					System.out.print(charAt);	
				
				
			}}
				
				
				else {
					
					System.out.print(" "+ s2[i] +"  ");	
					
				}
				
			
			}
			
			
				
			
		}
			
			
		
		
	}
		

