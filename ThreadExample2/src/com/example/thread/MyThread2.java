package com.example.thread;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("Hello....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
