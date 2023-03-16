package com.java.multithreading;

public class MainClass {

	public static void main(String[] args) {
		ThreadClassImpl t1 = new ThreadClassImpl();
		
		MyAnotherThread t2 = new MyAnotherThread();
		Thread tr = new Thread(t2);
		t1.start();
		tr.start();
	}
}
