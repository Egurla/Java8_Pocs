package com.java8.test;

public class myFnCLass {
		   public static void main(String args[]) {
		        // lambda expression
		    	MyFunctionalInterface1 sum = (a, b) -> a + b;
		        System.out.println("Result: "+sum.addMethod(12, 100));
		    
		}
}
