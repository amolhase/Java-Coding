package com.java8.CodingQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintEmployeeNameAlongWithCount {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(1,"Amol","JSE","IT",20000.0));
		emp.add(new Employee(1,"Sachin","SDE","IT",20000.0));
		emp.add(new Employee(1,"Amol","JSE","IT",30000.0));
		emp.add(new Employee(1,"Rohit","QA2","IT",50000.0));
		emp.add(new Employee(1,"Pravin","JSE","IT",60000.0));
		
		//Q. Print the name of employees along with count
	    Map<String, Long> result = emp.stream()
	    		.collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
	    System.out.println(result);
	    
	    //second way
	    Map<String, Integer> map = new HashMap<>();
	    for(Employee e : emp) {
	    	if(!map.containsKey(e.getName())) {
	    		map.put(e.getName(), 1);
	    	} else {
	    		map.put(e.getName(), map.get(e.getName()) + 1);
	    	}
	    }
	    
	    Set<Map.Entry<String, Integer>> hmap = map.entrySet();
	    for(Map.Entry<String, Integer> data : hmap) {
	    	System.out.println(data.getKey() + " " + data.getValue());
	    }
	}
}
