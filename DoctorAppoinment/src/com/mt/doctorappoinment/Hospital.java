package com.mt.doctorappoinment;

public class Hospital {
	int num;
	boolean valueSet = false;
	public synchronized void giveAppoinment(int num) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Doctor give Appoinment " +num+" patient");
		this.num = num;
		valueSet = true;
		notify();
	}

	public synchronized void getAppoinment() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println(" Patient get appoinment "+num+" Doctor");
		valueSet = false;
		notify();
	}


}
