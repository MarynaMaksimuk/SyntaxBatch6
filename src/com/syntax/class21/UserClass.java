package com.syntax.class21;

public class UserClass {
	String name;
	long phoneNumber;

	UserClass(String name, long phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
}

class UserInfo extends UserClass {
	String UserAddress;

	UserInfo(String name, long phoneNumber, String UserAddress) {
		super(name, phoneNumber);
		this.UserAddress = UserAddress;

	}

	void UserDetails() {
		System.out.println(name + " " + phoneNumber + " " + UserAddress);

	}

	public static void main(String[] args) {
		UserInfo x = new UserInfo("Marfa", 234999900, "80StMarks place");
		x.UserDetails();

	}
}