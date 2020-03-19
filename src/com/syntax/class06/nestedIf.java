package com.syntax.class06;

import java.util.Scanner;

public class nestedIf {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("Is there a sale?");
		String sale = i.nextLine();
		
		double discount = 0;
		double finalp = 0;

		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price?");
			double price = i.nextInt();
			
			if (price < 20){ 
				discount = price*0.10;
				
			} else if (price >= 20 && price < 100) {
				discount = price*0.20;
				
			} else if (price >= 100 && price < 500) {
				discount = price*0.30;
				
			} else if (price >= 500) {
				discount = price*0.50;
			}
				finalp = price-discount;
				System.out.println("Your final price is " + finalp);
		}else {
			System.out.println("I am not going shopping");
		}
			

	}}

