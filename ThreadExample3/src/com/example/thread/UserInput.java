package com.example.thread;

import java.util.Iterator;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Start Child Thread");
		for (int i = 0; i < 5; i++) {
			System.out.println("child");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

public class UserInput {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.start();
		t1.join();
		System.out.println("Start Main Method");
		for (int i = 0; i < 5; i++) {
			System.out.println("main");
			Thread.sleep(1000);

		}

	}

}
