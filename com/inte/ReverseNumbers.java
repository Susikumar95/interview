package com.inte;

public class ReverseNumbers {

		public int reverse(int num) {
			
			int qu = num, rev = 0, rem = 0;
			
			while (qu > 0) {
				
				rem = qu % 10;
				rev = (rev * 10 ) + rem;
				qu = qu / 10;
			}
			return rev;
			
		}

		public static void main(String[] args) {
			
			ReverseNumbers r = new ReverseNumbers();
			int i = r.reverse(12345);
			System.out.println(i);
		}
	}
