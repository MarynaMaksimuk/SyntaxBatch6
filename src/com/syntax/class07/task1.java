package com.syntax.class07;

import java.awt.font.NumericShaper.Range;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		
		for (int i=1; i<51; i++) {
			if (i%3==0) {
			continue;
		}System.out.println(i);
		
		System.out.println("---------------------------");
		
		Scanner x=new Scanner(System.in);
		String y;
		do {
			System.out.println("Please appply for a credit card");
			y=x.nextLine();
		}while (!y.equalsIgnoreCase("Yes"));
		break;}
		
		System.out.println("----------------------------------");
		Scanner x=new Scanner(System.in);
		
		int a;
		int b;
		int totalEven=0;
		int totalOdd=0;
		System.out.println("Please enter a range");
		a=x.nextInt();
		b=x.nextInt();
					
		for (int i=a; i<=b; i++) {
		if (i%2==0) {
			totalEven=totalEven+i;
		}else {
			totalOdd=totalOdd+i;
				
			}
		}System.out.println("Total of even "+totalEven);
		
	
		
		
	
				
				
		}
			
				
			
				
		}


