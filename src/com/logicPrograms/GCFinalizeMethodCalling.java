package com.logicPrograms;

public class GCFinalizeMethodCalling {
	
	static int count = 0;

	public static void main(String[] args) {
		
		for(int i=0;i<=100;i++) {
			GCFinalizeMethodCalling obj = new GCFinalizeMethodCalling();
			//String obj = new String();
			obj = null;
			//request to JVM to call garbage collector
			System.gc();
		}
	}
	public void finalize() {
		++count;
		System.out.println("Finalize method called "+ count);
	}
}
