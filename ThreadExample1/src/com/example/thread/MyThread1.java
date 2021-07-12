package com.example.thread;

import com.example.userservice.UserService;

public class MyThread1 extends Thread {
	UserService s;
	String str;
	public MyThread1(UserService s, String str) {
		super();
		this.s = s;
		this.str = str;
	}
	@Override
	public void run() {
		s.display1(str);
	}

}
