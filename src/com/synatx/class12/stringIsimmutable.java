package com.synatx.class12;

public class stringIsimmutable {

	public static void main(String[] args) {
		
		String str="Hello";
		String str1="World";
		str = str.concat(str1);
		System.out.println(str);

	}

}
