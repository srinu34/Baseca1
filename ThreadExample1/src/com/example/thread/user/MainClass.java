package com.example.thread.user;

import com.example.thread.MyThread1;
import com.example.thread.MyThread2;
import com.example.userservice.UserService;

public class MainClass {

	public static void main(String[] args)
	{
		UserService s=new UserService();
		MyThread1 t1=new MyThread1(s,"hi welcome");
		MyThread2 t2=new MyThread2(s,"hi Welcome");
		t1.start();
		t2.start();
	}
}
