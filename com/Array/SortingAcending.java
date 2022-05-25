package com.Array;

public class SortingAcending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,8,4,5,2,3};
		int temp=0;	
		for (int i = 0; i < arr.length; i++) {
			
			for (int j =i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) //for decending if(arr[i]<arr[j])
					//we are comparing elements of array 
				{
					//8=8
					
					//swapping
					  temp = arr[i];//passing array{i} to temp
					
					//4=4
	                   arr[i] = arr[j];    //storing arr j to i
	               // 8=8   
					arr[j] = temp;
					
				}
			}
		}
		
			
				for (int j2 = 0; j2 < arr.length; j2++) {
					System.out.println(arr[j2] ); //acending	
				}
				
				
				int length = arr.length;
				
				
				System.out.println("large num"+arr[length-1]); //large number
				
				
			

		}

	}


