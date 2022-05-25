package com.string;

public class RemoveParticularCharacter {

	
	
	
	public static void main(String[] args) {  
        String str = "wednesday";  
        System.out.println(charRemoveAt(str, 0));  
     }  
	
	//write this method first
     public static String charRemoveAt(String str, int p)  
     {  
        return str.substring(0, p) + str.substring(p + 1);  
     }  
}  



