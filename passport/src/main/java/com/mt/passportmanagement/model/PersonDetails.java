package com.mt.passportmanagement.model;

public class PersonDetails {

	private int P_id;
	private String name;
	private int age;
	private String gender;
	public PersonDetails() {
		super();
	}
	public PersonDetails(int p_id, String name, int age, String gender) {
		super();
		P_id = p_id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public int getP_id() {
		return P_id;
	}
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
