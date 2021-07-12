package com.mt.passportmanagement.model;

public class PassportDetails {

	private int pa_id;
	private String issue_place;
	private String issue_date;
	private PersonDetails person;
	public PassportDetails() {
		super();
	}
	public PassportDetails(int pa_id, String issue_place, String issue_date, PersonDetails person) {
		super();
		this.pa_id = pa_id;
		this.issue_place = issue_place;
		this.issue_date = issue_date;
		this.person = person;
	}
	public int getPa_id() {
		return pa_id;
	}
	public void setPa_id(int pa_id) {
		this.pa_id = pa_id;
	}
	public String getIssue_place() {
		return issue_place;
	}
	public void setIssue_place(String issue_place) {
		this.issue_place = issue_place;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public PersonDetails getPerson() {
		return person;
	}
	public void setPerson(PersonDetails person) {
		this.person = person;
	}
	
	
}
