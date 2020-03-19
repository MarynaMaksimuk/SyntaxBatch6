package com.synatx.class12;

public class moreStringFunctions {
	public static void main(String[]args) {
		String me="I am a good tester";
		
		System.out.println("------Replace function-------");
		me.replace("a","c");
		
		String str ="Phone number is 123456789";
		str = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str);
		
		String str1= "234567897";
		str1 = str1.replaceAll("[0-9]","A");
		System.out.println(str1);
		
		String str2="Hello234%%$#";
		str2 = str2.replaceAll("[^A-Za-z]","");
		System.out.println(str2);
		
		String subject="Java";
		subject= subject.replace("a","e").replace("J","I").toUpperCase();
		System.out.println(subject);


}}
