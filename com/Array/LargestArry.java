package com.Array;

public class LargestArry {
public static void main(String[] args) {
	
	
	

		int arr[]= {8,15,2,4,3,5};
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			
				if(max<arr[i]) { 		//smallest (max>arr[i]) 		
					max=arr[i];	
				}
				
			}
	
		System.out.println(max);
}
}

