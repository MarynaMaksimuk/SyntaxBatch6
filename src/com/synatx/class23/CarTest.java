package com.synatx.class23;

public class CarTest {
	public static void main(String[] args) {
		
		Car bmw= new BMW("BMW"); 
		Car mercedes=new Mercedes("Mercedes");
		Car honda=new Honda("Honda");
		
		Car []cars={bmw, mercedes, honda};
		for (Car x :cars) {
			x.start();
			x.display();
		}
	}

}
