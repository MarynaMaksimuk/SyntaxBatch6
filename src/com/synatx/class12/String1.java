package com.synatx.class12;

public class String1 {

	public static void main(String[] args) {
		
		String str="Good Morning Students!";
		
		char letter1=str.charAt(0);
		System.out.println(letter1);
		 char letter5=str.charAt(4);
		 System.out.println("Letter at index 4 is "+ letter5);
		 
		 // get all characters 1 by 1 from a String---CHAR AT---
		 
		 char letter;
		 for (int i=0; i<str.length(); i++) {
			 letter=str.charAt(i);
			 System.out.print(letter+" ");
		 }
		 
		 // function INDEX OF-----------------get index of specific character
		 String name="Syntax Technologies";
		 
		 int index=name.indexOf("y");
		 index=name.indexOf(" ");
		 index=name.indexOf("Syntax");
		 System.out.println(index);
		 index =name.indexOf("Technologies");
		 System.out.println(index);
		 
	}

}
