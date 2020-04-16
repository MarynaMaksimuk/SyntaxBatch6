package com.syntax.class25;

public interface Drivable {
	public static final boolean MOVE_FAST = true;

	public abstract void drive();

}

abstract class Vehicle {
	abstract void stop();
	
}

	class Car extends Vehicle implements Drivable {

		@Override
		public void drive() {
			System.out.println("Car drives");

		}

		@Override
		void stop() {
			System.out.println("Car stops");
		}

	}

