package com.homework;

public interface Shape {

	void calculateArea(int Radius);

	void calculatePerimetr(int side);

}

class Circle implements Shape {
	int Radius;

	@Override
	public void calculateArea(int Radius) {
		this.Radius = Radius;
		System.out.println("Circle area is " + (3.14 * (Radius * Radius)));

	}

	@Override
	public void calculatePerimetr(int Radius) {

		System.out.println("Circle perimetr is " + (2 * 3.14 * Radius));

	}}

	class Square implements Shape {
		int side;

		@Override
		public void calculateArea(int side) {
			this.side = side;
			System.out.println("Square area is " + (4 * side));

		}

		@Override
		public void calculatePerimetr(int side) {
			System.out.println("Square perimetr is " + (side * side));

		}

	}


