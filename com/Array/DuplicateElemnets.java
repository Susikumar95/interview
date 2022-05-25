package com.Array;

public class DuplicateElemnets {

	
	
	public static void main(String[] args) {
		
		//String arr[]= {"notepad value"}
		int arr[]= {2,1,2,3,4,4,5,9,5};
		//-->char give in your example
		//declare here your string
	//nested for loop
		
	//int count=0;
for (int i=0; i<arr.length; i++) {
for (int j =i+1; j < arr.length; j++) {
	if(arr[i]==arr[j]) 
		//it will compare 1 st and 2nd value
			{
					
		System.out.println(arr[j]);  
		
		//count=count+1;//whenever its going it duplicate character increase the count
				}			
			}
		}	
	}
}

