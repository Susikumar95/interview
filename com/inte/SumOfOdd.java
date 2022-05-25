package com.inte;

public class SumOfOdd {

		public static void main(String[] args) {
			int num = 5;
			int Oddsum = 0;
			for (int i = 1; i <= num; i++) {
				if (i % 2 != 0) {

					Oddsum = Oddsum + i;
				}
			}
	System.out.println(Oddsum);
			
		}
	}

