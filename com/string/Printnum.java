package com.string;

public class Printnum {
	public static void main(String[] args) {


        String s = "text123";
        char[] sarr = s.toCharArray();
        for (int i = 0; i < sarr.length; i++) 
        {
                if(sarr[i]/1>=48 && sarr[i]/1<=57)//this is ascii code value
                {
                        System.out.print(sarr[i]+", ");
                }else{
                        //System.out.print(sarr[i]+", ");
                }


        }


}

}
