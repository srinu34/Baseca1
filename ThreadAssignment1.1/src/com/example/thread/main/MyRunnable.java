package com.example.thread.main;

import com.example.thread.assignment.Table;

public class MyRunnable implements Runnable {

	int n;
	Table t;

	public MyRunnable(Table t, int n) {
		this.n = n;
		this.t = t;

	}

	@Override
	public void run() {
		t.multiplication(n);

	}

}
