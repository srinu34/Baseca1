package com.example.thread.main;

import com.example.thread.assignment.Table;

public class UserInput {
	public static void main(String[] args) {
		Table table = new Table();
		Mythread t1 = new Mythread(table, 2);
		Mythread t2 = new Mythread(table, 4);
		Mythread t3 = new Mythread(table, 6);
		t1.start();
		t2.start();
		t3.start();
	}

}
