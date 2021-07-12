package com.example.thread.main;

import com.example.thread.assignment.Table;

public class Mythread extends Thread {
	Table table;
	int n;

	public Mythread(Table table, int n) {
		this.n = n;
		this.table = table;

	}

	@Override
	public void run() {
		table.multiplication(n);
	}

}
