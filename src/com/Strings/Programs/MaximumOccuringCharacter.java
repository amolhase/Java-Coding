package com.Strings.Programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		
		String s = "SILLYSPIDERS";
		char[] y = s.toCharArray();
		int size = y.length;
		int i=0;
		int max = 0;
		char maxChar = ' ';
		Map<Character, Integer> map = new LinkedHashMap<>();
		while(i != size) {
			if(map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i], newval);
			}
			++i;
		}
		
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap) {
			if(data.getValue() > max) {
				max = data.getValue();
				maxChar = data.getKey();
			}
		}
		System.out.print("Maximum occuring Character is : " + maxChar);
	}
}
