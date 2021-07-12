package com.example.thread.assignment;

public class Table {
	public synchronized void multiplication(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));

		}
		System.out.println();
	}

}
