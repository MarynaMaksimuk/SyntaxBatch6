package com.synatx.class23;

public class FinalKeyword {
	public static String str="Hello";
	public static final String str1="Bye";
	
	
	public static void main(String[]args) {
		str ="Hi";
	//	str1="Good Bye";    error
		
	}
	public final void hello() {
		System.out.println(" I am a final method");
	}

}class SubClass extends FinalKeyword{
	//public final void hello() {// erro , can not override final method
		
	}

