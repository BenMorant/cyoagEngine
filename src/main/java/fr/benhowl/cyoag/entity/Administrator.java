package fr.benhowl.cyoag.entity;

public class Administrator extends User {

	private static final long serialVersionUID = 1L;

	@Override
	public ProfileType getProfile() {

		return ProfileType.administrator;
	}



}
