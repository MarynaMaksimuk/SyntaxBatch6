package com.syntax.class13;

public class Q4 {

	public static void main(String[] args) {
		
		// how many alpha characters are in String
		String str="Hijsjdskh345";
		str=str.replaceAll("[^A-Za-z]","");
		int number=str.length();
		System.out.println("Number of alpha charcaters is "+number);
		
		String myString="Today is Wednesday";
		String[]array= myString.split(" ");
		int words=array.length;
		System.out.println("Total words in string "+words);

	}

}
