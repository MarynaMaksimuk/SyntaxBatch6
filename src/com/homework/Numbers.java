package com.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Numbers {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
	

		for (int i = 2; i <= 50; i++) {
			if (i % 2 == 0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);

		Iterator<Integer> x = numbers.iterator();
		while (x.hasNext()) {
			int num = x.next();
			if (num % 5 == 0) {
				x.remove();

			}
		}
		System.out.println(numbers);
	}

}
