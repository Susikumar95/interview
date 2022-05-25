package com.string;

public class CountCharacterInString {

	public static void main(String[] args) {
		
		        String string = "W111";    
		        int count = 0;    
		          //split we use space  
		        
		        //Counts each character except space    
		        for(int i = 0; i < string.length(); i++) {    
		            
		        	if(string.charAt(i)!= ' ')    
		                count++;    
		        } 
		        
		       //i will use  if for presence of s and remaining letter   
		    
		        //Displays the total number of characters 
		        //present in the given string    
System.out.println("Total number of characters in a string: " + count);    
		    }    
		

	}


