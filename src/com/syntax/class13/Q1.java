package com.syntax.class13;

public class Q1 {

	public static void main(String[] args) {
		// write a program to swap two numbers without a temp. variable
		//swap two strings
		int a = 10;
		int b= 20;
		a=a+b;// 30
		b=a-b;// 30-20=10
		a=a-b;
		System.out.println("the value of a is " +a);
		System.out.println("the value of b is "+ b);
		
		String str1="Day";
		String str2 = "Night";
		str1=str1+str2; //DayNight
		str2=str1.substring(0 , str1.length()-str2.length()); //day
		str1=str1.substring(str2.length()); //night
		System.out.println(str1);
		System.out.println(str2);
		
		//another way 
		String s1="Hello";
		String s2="Bye";
		
	}

}
