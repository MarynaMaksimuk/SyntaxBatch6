package com.syntax.class04;

import java.util.Scanner;

public class hw {

	public static void main(String[] args) {

		Scanner i = new Scanner(System.in);
		System.out.println("Please enter your age");
		int x = i.nextInt();
		System.out.println("Please enter your gender:M or F");
		String y=i.next();
		
		if (x > 25) {
			if (y.equals("F")) System.out.println("Woman");
			else if (y.equals("M")) System.out.println("Man");
		}

		if (x < 25) {
			if (y.equals("M")) System.out.println("Boy");
			else if (y.equals("F")) System.out.println("Girl");
		
	
}}}
