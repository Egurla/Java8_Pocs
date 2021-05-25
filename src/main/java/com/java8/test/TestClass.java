package com.java8.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestClass {

	 public static void main(String args[])
	    {
	        // create anonymous inner class object
	        new Thread(new Runnable()
	        {
	            @Override
	            public void run()
	            {
	                System.out.println("New thread created1");
	            }
	        }).start();
	        
	        
	     // lambda expression to create the object
	        new Thread(()->
	           {System.out.println("New thread created2");}).start();
	        
	        System.out.println("using LIst -----");
	      
	        List<String> names =
	            Arrays.asList("kumar","monisa","g1","shanker","deva","dddd");
	  
	        
	        // lambda expression to create object
	        Predicate<String> p = (s)->s.startsWith("d");
	  
	        // Iterate through the list objects
	        for (String st:names)
	        {
	            
	            if (p.test(st))
	                System.out.println(st);
	        }
	  
	        
	  
	        List<String> list2 = new ArrayList<String>();
	        list2.add("abd");
	        list2.add("kumar");
	        list2.add("rajesg");
	     
	        //consummer
	        list2.forEach(str -> System.out.println(str.toUpperCase()));
	    }
	    }
	

