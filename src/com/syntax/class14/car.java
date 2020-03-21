package com.syntax.class14;

public class car {
	// define features of the car
	String make;
	String model;
	int year;
	String color;
	int speed;
	
	//define behavior
	
	void drive() {
		System.out.println("Car can drive");
	}void accelerance(){
		System.out.println("Car can accelerate");
	}

	public static void main(String[] args) {
		car car1=new car();
		car1.make="toyota";
		car1.model="camri";
		car1.year=2020;
		car1.color="black";
		
		// accessing behavior/method
		 car1.drive();
		 
		 
		  }
		}

