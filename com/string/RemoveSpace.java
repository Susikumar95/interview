package com.string;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s1="   su si kum a r ";
		
//		String trim = s1.trim();//only used to remove stating and ending space
//		System.out.println(trim);
		
		String replaceAll = s1.replaceAll("\\s","");// \\s is reprenting space
		System.out.println(replaceAll);
		
		
		
	}

}
