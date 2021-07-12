package com.mt.doctorappoinment;



public class Doctor implements Runnable{
	Hospital h;

	public Doctor(Hospital h)
	{
		this.h=h;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			h.giveAppoinment(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}

}
