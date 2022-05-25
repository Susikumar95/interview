package com.inte;

public class SwappingNumbers{
		
		private void swap() {

			int a = 10;
			int b = 20;
			int c;
			
			c = a + b;
			b = c - b;
			a = c - a;
			
			System.out.println(a);
			System.out.println(b);
	}
		public static void main(String[] args) {
			SwappingNumbers s = new SwappingNumbers();
			s.swap();
		}
		
	}

