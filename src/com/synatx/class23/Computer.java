package com.synatx.class23;

public class Computer {
	String brand;
	
	Computer(String brand){
	this.brand=brand;
	}
	void internetConnection() {
		System.out.println(brand +" has regular internet connection");
	}

}class Apple extends Computer{
	Apple(String brand){
		super(brand);
	}void internetConnection(){
		System.out.println(brand+ " has super fast internet");
	}void software(){
		System.out.println(brand +" uses MacOS software");
	}
	
}class Lenovo extends Computer{
	Lenovo(String brand){
		super(brand);
	}void internetConnection(){
		System.out.println(brand+ " has fast internet connection");
	}
	
}class HP extends Computer{
	HP (String brand){
		super(brand);
	}
	
}class Dell extends Computer{
	Dell(String brand){
		super(brand);
	}
		}

