package com.example.thread;

import com.example.userservice.UserService;

public class MyThread2 extends MyThread1 {

	public MyThread2(UserService s, String str) {
		super(s, str);
	}
	@Override
	public void run() {
		s.display2(str);
	}

}
