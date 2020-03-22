package com.syntax.class14;

public class Phone {
	String brand;
	String color;
	int generation;
	
	void internetAccess(String name) {
		System.out.println(brand+" has access to internet "+name);
	}
	void makeACall() {
		System.out.println(brand+" can make a call");
	}void playGame(){
		System.out.println( brand+" can play ganes");
	}
	

	public static void main(String[] args) {
		Phone iPhone=new Phone();
		iPhone.brand="Apple";
		iPhone.color="Gold";
		iPhone.generation=10;
		
		iPhone.internetAccess("Fire");
		iPhone.makeACall();
		iPhone.playGame();
		
		Phone Android=new Phone();
		Android.brand="Google";
		Android.color="white";
		Android.generation=4;
		
		Android.internetAccess("Spectrum");
		Android.makeACall();
		Android.playGame();

	}

}
