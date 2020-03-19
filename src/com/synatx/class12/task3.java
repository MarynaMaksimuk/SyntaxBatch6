package com.synatx.class12;

import java.util.Scanner;

public class task3 {
	public static void main (String[]args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("What are you having?");
		String gend=scan.nextLine();
		System.out.println("Enter mom's first name");
		String mom=scan.nextLine();
		System.out.println("Enter dad's first name");
		String dad=scan.nextLine();
		String name1;
		String name2;
		
		if(gend.equalsIgnoreCase("girl")) {
		name1=mom.substring(0,2);
		name2=dad.substring(3);
		System.out.print("Suggested name is "+name1+name2);}
		
		
		else if(gend.equalsIgnoreCase("boy")) { 
		name1=dad.substring(0,2);
		name2=mom.substring(3);
		System.out.println("Suggested name is "+name1+name2);
		
		}else {
			System.out.println("Enter valid gender");
		}

}}
