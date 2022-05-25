package com.inte;

public class Fibbonacci {

	public static void main(String[] args) {

		int initial=1;
		int first=1;
		
		
		System.out.print(initial +" "+first);
		
		for (int i=2; i <8; i++) {
			//1=0+1
			
			int third=initial+first;
			initial=first;
			first=third;
			
			
			System.out.print(" "+ third);
		}
		
		
		
	}

}
