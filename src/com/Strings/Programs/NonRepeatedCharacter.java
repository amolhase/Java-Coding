package com.Strings.Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String s = sc.nextLine();
		char[] y = s.toCharArray();
		int size = y.length;
		int i=0;
		String output = "";
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		while(i != size) {
			if(map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				int oldvalue = map.get(y[i]);
				int newval = oldvalue+1;
				map.put(y[i], newval);
			}
			++i;
		}
		
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap) {
			if(data.getValue() == 1) {
				output = output + data.getKey();
			}
		}
		System.out.println("NonRepeated characters are : "+ output);
	}
	
}
