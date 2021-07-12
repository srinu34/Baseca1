package com.example.thread.main;

import com.example.thread.assingment.Table;

public class Mythread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Hi....");
	}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Mythread2 t2 = new Mythread2();
		t2.start();
	}


}
