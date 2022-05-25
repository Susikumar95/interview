package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Mappie {

	 public static void main(String[] arg)
	    {
	        Map<String,String> gfg = new HashMap<String,String>();
	     
	        // enter name/url pair
	        gfg.put("1", "geeksforgeeks.org");
	        gfg.put("2", "practice.geeksforgeeks.org");
	        gfg.put("3", "code.geeksforgeeks.org");
	        gfg.put("4", "quiz.geeksforgeeks.org");
	        
	        
	        Set<Entry<String, String>> entrySet = gfg.entrySet();
	        
	        for (Entry<String, String> entry : entrySet) {
	       
	        	
	        	System.out.println("Key =" + entry.getKey() + " , Value = " + entry.getValue());
			}
	    }
}


