package com.java8.test;

import java.io.IOException;
import java.io.PrintWriter;

public interface MyFninterface2 {
	    public void executeTest();

	    default void print1(String text) {
	        System.out.println(text);
	    }

	    public static void print2(String text, PrintWriter writer) throws IOException {
	        writer.write(text);
	    }
	    
	}

