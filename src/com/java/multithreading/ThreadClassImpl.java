package com.java.multithreading;

//implementation using extending Thread class
public class ThreadClassImpl extends Thread {

	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Value of i is "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
