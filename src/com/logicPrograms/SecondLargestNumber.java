package com.logicPrograms;

public class SecondLargestNumber {
	
	public static int getSecondLargestNumber(int a[],int total) {
		int temp = 0;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
		
	}

	public static void main(String[] args) {
		int a[] = {6,2,5,3,8,9,11,3,1};
		System.out.println(getSecondLargestNumber(a, 9));
	}

}
