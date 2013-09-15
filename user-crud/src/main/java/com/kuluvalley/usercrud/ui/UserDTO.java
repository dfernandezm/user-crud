package com.kuluvalley.usercrud.ui;

/**
 * User interface shown to clients (web based, API endpoint...)
 * 
 * @author David
 *
 */
public class UserDTO {

	private long userId;
	private String name;
	// For the interface, we provide a formatted date of birth in a specific format 
	// it can be Calendar or Date but built-in conversion should be provided
	private String dateOfBirth; 
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	
	
}
