package com.example.thread;

class Display {
	public void wish(String name) {
		synchronized (Display.class) {
			for (int i = 0; i <2; i++) {
				System.out.println("GoodMorning:");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				System.out.println(name);
			}

		}
	}
}

class Mythread extends Thread {
	Display d;
	String name;

	public Mythread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}

}

public class Main {
	public static void main(String[] args)
	{
		Display d=new Display();
		Mythread t1=new Mythread(d,"dhoni");
		Mythread t2=new Mythread(d,"yuvraj");
		
		t1.start();
		t2.start();

		
	}

}
