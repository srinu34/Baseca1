package com.example.covidmanagement.model;

public class CovidDetails implements Comparable<CovidDetails> {

	
	private int id;
	private int no_of_testing_done;
	private int no_of_covid_positive_patients;
	private String city;
	private String state;
	private int no_of_infected;
	private String date;
	public CovidDetails() {
		super();
	}
	public CovidDetails(int id,int no_of_testing_done, int no_of_covid_positive_patients, String city, String state,
			int no_of_infected, String date) {
		super();
		this.id=id;
		this.no_of_testing_done = no_of_testing_done;
		this.no_of_covid_positive_patients = no_of_covid_positive_patients;
		this.city = city;
		this.state = state;
		this.no_of_infected = no_of_infected;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNo_of_testing_done() {
		return no_of_testing_done;
	}
	public void setNo_of_testing_done(int no_of_testing_done) {
		this.no_of_testing_done = no_of_testing_done;
	}
	public int getNo_of_covid_positive_patients() {
		return no_of_covid_positive_patients;
	}
	public void setNo_of_covid_positive_patients(int no_of_covid_positive_patients) {
		this.no_of_covid_positive_patients = no_of_covid_positive_patients;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getNo_of_infected() {
		return no_of_infected;
	}
	public void setNo_of_infected(int no_of_infected) {
		this.no_of_infected = no_of_infected;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public int compareTo(CovidDetails o) {
		return this.getCity().compareTo(o.getCity());
	}
	@Override
	public String toString() {
		return "CovidDetails [id=" + id + ", no_of_testing_done=" + no_of_testing_done
				+ ", no_of_covid_positive_patients=" + no_of_covid_positive_patients + ", city=" + city + ", state="
				+ state + ", no_of_infected=" + no_of_infected + ", date=" + date + "]";
	}
	
	
}
