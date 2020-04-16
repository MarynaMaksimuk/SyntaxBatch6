package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Toyota");
		cars.add("Lexus");
		cars.add("Nissan");
		cars.add("Volvo");

		Iterator<String> x = cars.iterator();
		while (x.hasNext()) {
			String str = x.next();
			System.out.println(str);
		}

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("------------");
		for (String y : cars) {
			System.out.println(y);

		}
	}
}