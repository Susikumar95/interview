package com.string;
import java.util.Arrays;
public class SortTheString {
	public static void main(String[] args) 
	{
		
		//approach 1
		String s1="Sujkhj";
		char[] charArray = s1.toCharArray();
		char t;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i+1; j < charArray.length; j++) {
				if(charArray[i]>charArray[j])
				{
					t=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=t;	
				}
			}	
		}
		
		System.out.println(charArray);

		//approach 2
		String s2="Sroza";
		char[] charArrays = s2.toCharArray();
		Arrays.sort(charArrays);
		System.out.println(charArrays);
	}


}
