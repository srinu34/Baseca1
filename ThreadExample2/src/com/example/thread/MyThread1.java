package com.example.thread;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Hi....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyThread2 t2 = new MyThread2();
		t2.start();
	}

}
