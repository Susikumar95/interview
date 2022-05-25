package com.inte;

public class LowestNumberInArray2 {
	
		public static void main(String[] args) {
			
			
		int	a[]= {10,4,5,-3,-5};
			
			
			int smallValue = Integer.MAX_VALUE;
			
		
			
			for (int i = 0; i < a.length; i++) {
				
				
				if(smallValue>a[i]) {
					
					smallValue=a[i];
					
				}
				
				
			}
			
			System.out.println(smallValue);
			
			
			
			
			
			
		}}