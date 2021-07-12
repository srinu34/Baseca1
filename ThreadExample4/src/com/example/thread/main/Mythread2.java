package com.example.thread.main;

import com.example.thread.assingment.Table;

public class Mythread2 extends Mythread {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Hello....");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
