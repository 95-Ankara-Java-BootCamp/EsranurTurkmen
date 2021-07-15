package Entities;

import Abstracts.Entity;

public class Flight implements Entity {

	private int id;
	private String flightName;
	private String date;
	private String time;
	
	public Flight(int id, String flightName, String date, String time) {
		super();
		this.id = id;
		this.flightName = flightName;
		this.date = date;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
