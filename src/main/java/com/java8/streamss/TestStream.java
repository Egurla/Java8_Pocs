package com.java8.streamss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestStream {
public static <R> void main(String[] args) {
	
	
	List<Student> student=new ArrayList<Student>();
	
	List<String> address1 =Arrays.asList("TS","600006");
	List<String> address2 =Arrays.asList("MP","600005");
	
	List<String> address3 =Arrays.asList("KN","600007");
	
	List<String> address4 =Arrays.asList("TN","600008");
	
	List<String> address5 =Arrays.asList("AP","600002");
	
	
	student.add(new Student(101,"kiran", address1));
	student.add(new Student(102,"rakesh", address2));
	student.add(new Student(103,"raju", address3));
	student.add(new Student(104,"rame", address4));
	student.add(new Student(105,"siva", address5));
	
	//using map
	List<Integer> list=student.stream().map(( x->{
		
		return x.getId();
		
	})).collect(Collectors.toList());
	System.out.println(list);
	
List<String> names=student.stream().map(( x->{
		
		return x.getName();
		
	})).collect(Collectors.toList());
	System.out.println(names +" "+names.size());
	
		/*
		 * listOfLists.stream() .flatMap(x -> x.stream()) .collect(Collectors.toList());
		 */


	//using flatmap 
	List<String> ad1=student.stream().flatMap(x->x.getAddresses().stream())
			.collect(Collectors.toList());

	System.out.println(ad1+" "+ad1.size());
	
	List<String> ad=student.stream().flatMap(( x->{
		return x.getAddresses().stream();	
	})).collect(Collectors.toList());
	
	
	System.out.println(ad +" "+ad.size());
}
}
