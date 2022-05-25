package com.string;

public class PrintingCapitalVowelsmallletter {
public static void main(String[] args) {
	
	
	String s = "AaeioubkbA@d";
	String s2=" ";

	int capital=0;
	int small=0;
	int num=0;
	int spl=0;
	for (int i = 0; i < s.length(); i++) {
		
		char charAt = s.charAt(i);
		//if(charAt=='a'||charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u') 

			if(charAt>='A' && charAt<='Z') 
		{
			
			capital=capital+1;		
		}
		else if(charAt>='a' && charAt<='z') 	
		{
			
			small=small+1;
		}	
		else if(charAt>='0' && charAt<='9') 
		{
			
			num=num+1;
		}
		else	
		{
			
			spl=spl+1;
		}
	}


	System.out.println("print capital letter "+ capital);
	System.out.println("print small letter "+ small);
	System.out.println("print num letter "+ num);
	System.out.println("print spl letter "+ spl);
}
}
