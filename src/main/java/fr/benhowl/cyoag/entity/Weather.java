package fr.benhowl.cyoag.entity;

import java.io.Serializable;

public class Weather implements Serializable{

	private static final long serialVersionUID = 1L;

	private String kind;
	private int temperature;
	private int windLevel;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getWindLevel() {
		return windLevel;
	}

	public void setWindLevel(int windLevel) {
		this.windLevel = windLevel;
	}
}
