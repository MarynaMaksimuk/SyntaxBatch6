package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=178;
		if (num>=1&&num<=10) {
			System.out.println("This number id small");
		}else if(num>10&&num<=100) {
			System.out.println("This is a big number");
		}else if(num>100&&num<=1000) {
			System.out.println("This is a large number");
		}else {
			System.out.println("Number is super large");
		}
		Scanner i= new Scanner(System.in);
		System.out.println("What is out age");
		int age=i.nextInt();
		
		
		
		if (age>=0&&age<3) {
			System.out.println("You are a baby");
		}else if(age>=3&&age<=5) {
			System.out.println("You are a kid");
		}else if(age >=6&&age<=12) {
			System.out.println("You are a child");
		}else if(age>12&&age<=19) {
			System.out.println("You are a teenager");
		}else {
			System.out.println("You are enjoing your life");
		
				

	}}}


