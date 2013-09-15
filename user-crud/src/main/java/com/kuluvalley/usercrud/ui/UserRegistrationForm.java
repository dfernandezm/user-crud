package com.kuluvalley.usercrud.ui;

/**
 * Possible interface object for user registration. Need to add more fields to User
 * 
 * @author David
 *
 */
public class UserRegistrationForm {
	
	private String name;
	private String dateOfBirth;
	private String password;
	private String repeatedPassword;
	private String email;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepeatedPassword() {
		return repeatedPassword;
	}
	public void setRepeatedPassword(String repeatedPassword) {
		this.repeatedPassword = repeatedPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
