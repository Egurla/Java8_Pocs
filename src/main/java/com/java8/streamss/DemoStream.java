package com.java8.streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args)
    {
    	
    	Stream<String> stream = Stream.of("INdea", "canada",
                "US", "Aus",
                "UK", "Chia");
    	stream.filter(x->x.startsWith("U")).forEach(System.out::println);;

		
    	
    	
    	//adding integer in List
    	 List<Integer> list1 = Arrays.asList(1,2,3);
         List<Integer> list2 = Arrays.asList(4,5,6);
         List<Integer> list3 = Arrays.asList(7,8,9);
           
         List<List<Integer>> list = Arrays.asList(list1, list2, list3);
          
         //using flatmap to diplay all integers
         List<Integer> listOIntegers = list.stream().flatMap(x -> x.stream())
                             .collect(Collectors.toList());
   
         System.out.println(listOIntegers);
    	
         
         
         String[][] arr = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
         
         List<String> cc = Arrays.stream(arr).flatMap(x -> Arrays.stream(x))
                                     .collect(Collectors.toList());
   
         System.out.println(cc);
    	/*
		 * // Print the stream stream.forEach(s -> System.out.println(s)); List<String>
		 * cities = Arrays.asList("New York", "Tokyo", "New Delhi"); List<String>
		 * list=cities.stream().filter(x->x.startsWith("N"))
		 * .forEach(System.out::println);
		 */
}
}