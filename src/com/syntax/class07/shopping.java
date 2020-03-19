package com.syntax.class07;

import java.util.Scanner;

public class shopping {

	public static void main(String[] args) {
		
		Scanner s;
		String item;
		double price;
		double money;
		double amount=0;
		double change;
		double balance;
		
		s=new Scanner(System.in);
		System.out.println("What are you buying");
		item=s.nextLine();
		System.out.println("What is the price");
		price=s.nextDouble();
		do {
			System.out.println("Please pay");
			money=s.nextDouble();
			
			amount=amount+money;
			
			if(money<price) {
				balance=price-amount;
				System.out.println("Please give more "+balance);
				}else if (amount>price){
					change=money-price;
					System.out.println("Here is your chnage "+change);
					break;
				
		while(price!=amount);
		System.out.println("Thank you!");
	}}}
}
	
