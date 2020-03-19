package com.syntax.class07;

import java.util.Scanner;

public class WhileDoWhat {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=1;
		while(num<=5) {
			System.out.println("What is your name");
			String name=input.nextLine();
			System.out.println("Good afternoon "+name);
			num++;
		}
	}

}
