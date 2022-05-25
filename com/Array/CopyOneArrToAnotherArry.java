package com.Array;

public class CopyOneArrToAnotherArry {


	public static void main(String[] args) {

		int arr[] ={25, 11, 7, 75, 56};  

		int arrb[] = new int[arr.length];
		
		for (int i = 0; i<arr.length; i++){	
			arrb[i]=arr[i];
		}
		
	System.out.println("array 1");
	
	for (int i = 0; i < arr.length; i++) {
		
		System.out.println(arr[i]);
		
	}
	System.out.println("array 12");
	
	
	for (int i = 0; i < arrb.length; i++) {
		System.out.println(arrb[i]);
	}
		
}}
