package com.mt.doctorappoinment;



public class Patient implements Runnable {
	Hospital h;

	public Patient(Hospital h) {
		this.h=h;
		Thread t = new Thread(this, "Patient");
		t.start();
	}

	public void run() {
		
		for(int i=0;i<10;i++) {
			h.getAppoinment();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}

	}

}
