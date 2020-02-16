package fr.benhowl.cyoag.entity;

import java.io.Serializable;
import java.util.List;

public class Inventory implements Serializable {

	private static final long serialVersionUID = 1L;

	private People people;
	private List<Object> objects;

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public List<Object> getObjects() {
		return objects;
	}

	public void setObjects(List<Object> objects) {
		this.objects = objects;
	}
}
