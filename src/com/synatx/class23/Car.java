package com.synatx.class23;

public class Car {

	String make;

	public Car(String make) {
		this.make = make;
	}

	public void display() {
		System.out.println("I have " + make);
	}

	public void start() {
		System.out.println(make + " starts by turning key");
	}

}

class BMW extends Car {
	public BMW(String make) {
		super(make);
	}

	public void start() {
		System.out.println(make + " starts with push button");
	}
}

class Mercedes extends Car {
	Mercedes(String make) {
		super(make);

	}

	public void start() {
		System.out.println(make + " starts remotely");
	}
}

class Honda extends Car{

	public Honda(String make) {
			super(make);
		}
}