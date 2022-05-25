package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Listee {
	public static void main(String args[])
    {
        // Creating a ArrayList
        List<String> myList = new ArrayList<String>();
 
        // Adding elements to the list
        // Custom inputs
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
 
        // For loop for iterating over the List
        for (int i = 0; i < myList.size(); i++) {
 
            // Print all elements of List
            System.out.println(myList.get(i));
        }
}
}
