package com.string;

public class ConvertUpperToLower {
	public static void main(String[] args) {  
        String s1="Raja Sekar Shanmugam QA";  
        
        StringBuffer newStr=new StringBuffer(s1);  // StringBuffer is mutable class
          
        for(int i = 0; i < s1.length(); i++) {  
              
            //Checks for lower case character  
            if(Character.isLowerCase(s1.charAt(i))) {  
                //Convert it into upper case using toUpperCase() function  
                newStr.setCharAt(i, Character.toUpperCase(s1.charAt(i)));  
            }  
            //Checks for upper case character  
            else if(Character.isUpperCase(s1.charAt(i))) {  
                //Convert it into upper case using toLowerCase() function  
                newStr.setCharAt(i, Character.toLowerCase(s1.charAt(i)));  
            }  
        }  
        System.out.println("String after case conversion : " + newStr);  
    }  
}  

