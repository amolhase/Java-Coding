package com.java8.CodingQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoLists {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(12,22,3,42,95,76);
		List<Integer> list2 = Arrays.asList(24,59,62,72,87,29);
		
		//Q. merge two lists using java 8 (duplicates are allowed)
		
		List<Integer> result = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(result);
		
		//Q. merge two lists using java 8 (duplicates are not allowed)
		
		Set<Integer> uniqueResult = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toSet());
		System.out.println(uniqueResult);
		
		//Q. find largest number from list
		Integer max = uniqueResult.stream().max((x1,x2) -> x1-x2).get();
		System.out.println("Max number --> "+max);
		
		//Q. find minimum number from the list
		Integer min = uniqueResult.stream().min((x1,x2) -> x1-x2).get();
		System.out.println("Min number --> " +min);
		
		//Q. sort the above list
		List<Integer> sortedList = uniqueResult.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List --> " +sortedList);
	}
}
