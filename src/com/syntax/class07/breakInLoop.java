package com.syntax.class07;

public class breakInLoop {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			if(i==4) {
				System.out.println("I am stopping the loop");
				break;
			}System.out.println(i);
		}
		System.out.println("The end");
		
		System.out.println("-------------------");
	
		 for (int y=1; y<=10; y++) {
		 if (y==4) {
			 System.out.println("I am skipping interation");
			 continue;
		 }
		 System.out.println("I am inside the loop");
		 System.out.println(y);
		 
		 System.out.println("--------------------------");
		 for(int i=1; i<21; i++) {
			 if(i==5 || i==6 || i==7) {
				 continue;
			 }
			 System.out.println(i);
		 }

	}
	

}}
