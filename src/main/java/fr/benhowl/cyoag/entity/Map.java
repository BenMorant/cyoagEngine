package fr.benhowl.cyoag.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Map implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String description;

	private List<Region> regions = new ArrayList<>();

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

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}
}
