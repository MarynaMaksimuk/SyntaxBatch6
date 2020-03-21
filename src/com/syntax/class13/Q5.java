package com.syntax.class13;

public class Q5 {

	public static void main(String[] args) {
		// Reversing String character by character
		
		String given ="I love Java";
		String reversed="";
		for (int i=given.length()-1;i>=0;i--) {
			reversed=reversed+given.charAt(i);
			
		}System.out.println("Reversed string = "+reversed);
		
		String[] array=given.split(" ");
		String reversedWords="";
		for (int y=array.length-1; y>=0; y--) {
			reversedWords=reversedWords+array[y]+" ";
		}System.out.println("Reversed words string is "+reversedWords);

	}

}
