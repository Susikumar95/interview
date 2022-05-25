package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacterAndNumberOf{
	public static void main(String[] args) {
		
		String s1="rajasekar";
		char[] words = s1.toCharArray();//STring to array of character converison
		
	Map <Character,Integer> charMap=new HashMap<>(); 	
		for (char ch:words) //fetching all charcter 
		{	
			if(charMap.containsKey(ch)) 
				//if our map contains that character
			{	
				charMap.put(ch,charMap.get(ch)+1);
				//contains that character,it will increase the value
				//Integer integer = charMap.get(ch);	
			}
			
			else //no means it will add one key and value pair to map.
			{
				charMap.put(ch,1);
			}	
		}
		//printing Map
		Set<Entry<Character,Integer>> entrySet = charMap.entrySet();	
		for (Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			
			//for finding duplicate then write if block, 
			//if you need how many times repeating means you just skip below bloc
//			if (value>1)
//			{
//				System.out.println(key + "is duplicate" + "and repeating" +value+"times");		
//			}
					//System.out.println(key +"."+value);
			System.out.println("key is = " + key + ","+ "value is =" + value);
		//System.out.println(key + "is repeating" +value+"times");
				
		}

	}
}
