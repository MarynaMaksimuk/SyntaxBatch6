package com.syntax.class20;

	public class Car {
	
	String make, model;
	public Car() {
		
	}
	
	public Car(String make, String model){
		this.make=make;
		this.model=model;
		
	}

}class Mersedes extends Car{
	
	String sportModel;
	
	public Mersedes(String make, String model, String sportModel){
		super(make ,model);
		this.sportModel=sportModel;
		
		// compiler adds super() by default
		System.out.println("I am child class constructor");
	}public void display() {
		System.out.println("I have "+ make+" "+" "+model+" "+sportModel);
	}}
