package fr.benhowl.cyoag.entity;

import java.io.Serializable;


public class Time implements Serializable{

	private static final long serialVersionUID = 1L;

private int day;
private int hour;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
}

