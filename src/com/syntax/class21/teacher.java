package com.syntax.class21;

public class teacher {
	
	String name;
	String lastName;
	
	public teacher() {
		System.out.println("I am a parent constructor");
		
	}public teacher(String name, String lastName){
		
		this.name=name;
		this.lastName=lastName;
	}

}
