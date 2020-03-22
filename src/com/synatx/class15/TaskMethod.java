package com.synatx.class15;

public class TaskMethod {
	void larger (int a, int b){
		if (a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}void oddEven(int x){
		if(x%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
	}void palindrome(String word){
		char []array=word.toCharArray();
		String pal="";
		for (int i=array.length-1; i>=0; i--) {
			pal+=array[i];
		}if (pal.equalsIgnoreCase(word)) {
			System.out.println("This is palindrome");
		}else {
			System.out.println("This is not a palindrome");
		}
	}void Hello(String country){
		if (country.equalsIgnoreCase("Russia")) {
			System.out.println("Privet");
		}else if(country.equalsIgnoreCase("France")) {
			System.out.println("Bonjour");
		}else if(country.equalsIgnoreCase("Spain")) {
			System.out.println("Hola");
	}	else if(country.equalsIgnoreCase("China")) {
		System.out.println("Nǐn hǎo");
	}	else if (country.equalsIgnoreCase("Italy")) {
		System.out.println("Salve");
	}else {
		System.out.println("Please enter a valid country");
	}}

	public static void main (String[]args) {
		TaskMethod num=new TaskMethod();
		num.larger(3, 49);
		num.oddEven(89);
		num.palindrome("radio");
		num.Hello("china");
	}
	
}
