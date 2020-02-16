package fr.benhowl.cyoag.entity;

import java.io.Serializable;

public class Game implements Serializable {

	private static final long serialVersionUID = 1L;

	private String Name;

	private Player player;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
