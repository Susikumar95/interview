package com.inte;

public class Variable {

	
		// TODO Auto-generated method stub

		static int a=20;
		int b=10;
		
		
		public void print() {
		System.out.println(a);
		System.out.println(b);
		a++;
		b++;
		}
		
		public static void main(String[] args) {
		Variable a=new Variable();
		a.print();
		Variable b=new Variable();
		b.print();
		Variable c=new Variable();
		c.print();
		}
		
	}


