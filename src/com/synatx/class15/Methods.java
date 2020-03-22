package com.synatx.class15;

public class Methods {
	// create a method that will say welcome" 10 times
	
	void sayWelcome() {
		for (int i=0; i<10; i++) {
			System.out.println("Welcome");
		}
	}

// create a method which says any word # of times
	void sayAnything(String word, int number) {
		for (int i=1; i<=number; i++) {
		System.out.println(word);
		
	}}
	void isItRaining(boolean isRain) {
		if(isRain) {
			System.out.println("Stay home and learn Java");
		}else {
			System.out.println("Go for a walk");
		}
	}

}