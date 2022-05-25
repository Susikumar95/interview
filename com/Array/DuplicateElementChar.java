package com.Array;

public class DuplicateElementChar {

	
	public static void main(String[] args) {
		
	int	arr[]= {1,4,4,1,3};
	
	int farry[]= new int[arr.length];//storing in new array
	
	for (int i = 0; i < arr.length; i++) {
		
		int count=1;
		for (int j=i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]) //comparing
			
			{	
			count++;
			farry[j]=-1;//it will assign -1
			}	
		}
			
		if(farry[i]!=-1) //not equal to -1 means count will be stored in i array
		
		{	
			
			farry[i]=count;	
	}	
		
	}
	
	//repeating numbers 
	for(int i = 0; i < farry.length; i++){  
        if(farry[i]!=-1)  
            System.out.println( arr[i] + "is repeating" + farry[i]+ "times");  
    }  
			
	}
		
	}
