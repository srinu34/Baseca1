package com.sbi.atm.trancation;

public class Atm 
{
	
	private String transcationid;
	private String date;
	private double balance;

	
	public Atm() {
		super();
	}

	public Atm(String transcationid, String date, double balance) {
		super();
		this.transcationid = transcationid;
		this.date = date;
		this.balance = balance;
	}

	public String getTranscationid() {
		return transcationid;
	}

	public void setTranscationid(String transcationid) {
		this.transcationid = transcationid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAmount() {
		return balance;
	}

	public void setAmount(double balance) {
		this.balance = balance;
	}

	

}
