package com.syntax.class05;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i=new Scanner(System.in);
		//*System.out.println("Please enter yout height in inches");
		//int x=i.nextInt();
	//	if (x<60) {
	//		System.out.println("You are short");
		//}else if(x>=60&&x<=72) {
	//		System.out.println("You are medium");
	//	}else if(x>72){
	//		System.out.println("You are tall");
			
		 System.out.println("Enter a number of the day");
		int y=i.nextInt();
		if (y>=1&&y<=5) {
			System.out.println("It is a weekday");
		}else if (y>=6&&y<=7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
	}

}
