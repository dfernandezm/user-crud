package com.kuluvalley.usercrud.model.user;

public class User {

	private long userId;
	private String name;
	private long dateOfBirthMillis;
	
	public User() {
		
	}

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getDateOfBirthMillis() {
		return dateOfBirthMillis;
	}
	public void setDateOfBirthMillis(long dateOfBirthMillis) {
		this.dateOfBirthMillis = dateOfBirthMillis;
	}

}
