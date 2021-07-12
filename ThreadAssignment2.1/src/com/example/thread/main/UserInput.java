package com.example.thread.main;

import com.example.thread.assignment.Table;

public class UserInput {
	public static void main(String[] args)
	{
		Table table=new Table();
		Thread t1=new Thread(new MyRunnable(table, 4));
		Thread t2=new Thread(new MyRunnable(table, 6));
		Thread t3=new Thread(new MyRunnable(table, 5));
		t1.start();
		t2.start();
		t3.start();
		
	}

}
