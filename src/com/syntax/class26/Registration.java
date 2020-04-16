package com.syntax.class26;

public class Registration {
	private String email;
	private String username;
	private String password;
	
	public String getEmail() {
		return email;
	}public String getUsername() {
		return username;
	}public String getPassword() {
		return password;
	}
	
	public void setEmail(String email) {
		if (email.contains("yahoo")) {
		this.email=email;}
		else {
			System.out.println("Invalid email");
		}
		
	}public void setUsername(String username) {
		if (!username.isEmpty()&& username.length()>6) {
		this.username=username;}
		else {
			System.out.println("Invalid user Name");
		}
	}public void setPassword(String password) {
		if (!password.isEmpty()) {
			if(password.length()>6) {
				if (!password.contains(username)) {
					this.password=password;
				}else {
					System.out.println("Password can not contain username");
				}
				
			}else {
				System.out.println("The password is too short");
			}
		
	}else {
		System.out.println("Password can not be empty");
	}
	
}}
