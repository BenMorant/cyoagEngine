package fr.benhowl.cyoag.entity;

import java.util.List;

public class Player extends User {

	private static final long serialVersionUID = 1L;
	private List<Game> games;

	@Override
	public ProfileType getProfile() {

		return ProfileType.player;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
}
