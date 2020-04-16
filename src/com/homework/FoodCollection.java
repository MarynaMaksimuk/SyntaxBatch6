package com.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodCollection {
	public static void main(String[] args) {
		ArrayList<Food> list = new ArrayList<>();
		Food one = new Pasta("pasta");
		list.add(one);
		Food two =new Steak("steak");
		list.add(two);

		Iterator<Food> x = list.iterator();
		while (x.hasNext()) {
			Food str = x.next();
			System.out.println(str);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
