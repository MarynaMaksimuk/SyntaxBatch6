package com.syntax.class20;

public class Doctor {
	int Id;
	String name;

	public Doctor(String name, int Id) {
		this.name = name;
		this.Id = Id;
	}

}

class Dentist extends Doctor {
	Dentist(String name, int Id){
		// compiler will try to make a call to parent class constructor
		super(name, Id);
	}

}
