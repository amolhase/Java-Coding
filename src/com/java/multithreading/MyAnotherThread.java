package com.java.multithreading;

//Implementation using implementing Runnable interface
public class MyAnotherThread implements Runnable {

	public void run() {
		for(int i=10;i>=1;i--) {
			System.out.println("Value of i "+ i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
