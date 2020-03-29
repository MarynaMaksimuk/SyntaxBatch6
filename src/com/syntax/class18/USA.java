package com.syntax.class18;

public class USA {
	String state, stateCapital;
	public void display() {
		System.out.println(state+" and it's capital is "+stateCapital);
	}
	
	// create constructor that will initialize instance variables
	
	public USA(String usaState, String usaStateCapital) {
		state=usaState;
		stateCapital=usaStateCapital;
	}public static void main(String[]args) {
		USA usa=new USA("Virginia", "Richmond");
		usa.display();
	}
	

}
