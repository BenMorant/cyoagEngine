package fr.benhowl.cyoag.entity;

import java.io.Serializable;

public abstract class User implements Serializable{

	private static final long serialVersionUID = 1L;

    private String lastName;
    private String firstName;
    private String nickName;
    private String profilePicture;
	private String email;

    private Credentials credentials;

	abstract public ProfileType getProfile();
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public enum ProfileType {
		player, administrator
	}
}



