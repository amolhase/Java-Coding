package com.Arrays.Programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintNumberAndItsOccurance {

	public static void main(String[] args) {
		
		//int a[] = new int[10];
		int a[] = {6,2,3,4,1,6,4,3,2,7,8,2,1,4,5};
		int size = a.length;
		int i=0;
		Map<Integer, Integer> map = new LinkedHashMap<>();
		while(i != size) {
			if(map.containsKey(a[i]) == false) {
				map.put(a[i], 1);
			} else {
				int oldval = map.get(a[i]);
				int newval = oldval + 1;
				map.put(a[i], newval);
			}
			++i;
		}
		
		Set<Map.Entry<Integer, Integer>> hmap = map.entrySet();
		for(Map.Entry<Integer, Integer> data: hmap) {
			System.out.println(data.getKey() + " " +data.getValue());
		}
	}
}
