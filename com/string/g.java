package com.string;

public class PrintingSeparate {
	public static void main(String[] args) 
	{
		
		String str = "abc defg hi jklm";
        String parts[] = str.split(" ");
        for(String part: parts) 
        	//for each loop for printing separate
        
        {
            System.out.println(part);
}
	}
}

