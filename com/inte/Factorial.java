package com.inte;

public class Factorial {
	
		private void Factorial1(int num) {
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println(fact);
		}
		public static void main(String[] args) {
			Factorial f = new Factorial();
			f.Factorial1(5);
			
		}
}
