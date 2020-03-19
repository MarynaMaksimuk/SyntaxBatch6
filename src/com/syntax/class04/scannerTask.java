package com.syntax.class04;

import java.util.Scanner;

public class scannerTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("How much money do you need?");
		int loan=input.nextInt();
		if(loan<= 200000) {
			System.out.println("Take the money");
		}else {
			System.out.println("Sorry, too much. You are rejected");
		}
		
		
		

	}

}
