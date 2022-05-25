package com.inte;

public class SwappingNumbersWithout3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int a = 3;
				int b = 5;
				
				a = a + b;
				b = a - b;
//			a = a - b;
				a = b + b;
				
				System.out.println(a);
				System.out.println(b);
			}
	}
