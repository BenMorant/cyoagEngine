package fr.benhowl.cyoag.entity;

import java.io.Serializable;

public abstract class Object implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String description;
	private Float weight;

	private Inventory inventory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}
