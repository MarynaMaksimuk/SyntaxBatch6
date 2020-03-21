package com.syntax.class13;

public class Q6 {

	public static void main(String[] args) {
		// write a java pRrogram to find whether a String is palindrome or not
		
		String str="kayak";
		char [] array = str.toCharArray();
		String reverse="";
		for (int i=array.length-1; i>=0; i--) {
			reverse+=array[i];
		}System.out.println("reverse is "+reverse);
		
		if (str.equalsIgnoreCase(reverse)) {
			System.out.println("Yes, it is a palindrome");
		}else {
			System.out.println("No, it is not");
		}
	}

}
