package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {
	public static void main(String[] args) {
		Flower []flowerArray={new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};
		
		ArrayList<Flower>flowers=new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
		System.out.println(flowerArray);
		// to call available methods using for loop, advanced loop and iterator
		// create food class(3 undefined methods)  that will have 4 subclasses;
		// create collection of food and using 3 different ways execute methods
	// look over LinkedList and set Interface
	//3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 

	//4. Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.


	//to call available methods using
	for(int i=0;i<flowers.size();i++) {
		flowers.get(i).bloom();
	System.out.println("-------------");
	}
	for(Flower f:flowers) {
		f.bloom();
		System.out.println("-----------------");
	}
	Iterator<Flower>f=flowers.iterator();
	while(f.hasNext()) {
		Flower x=f.next();
		x.bloom();
		System.out.println("----------");
	}
	
	}
}