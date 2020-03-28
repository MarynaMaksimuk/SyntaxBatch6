package com.syntax.class18;

public class ConstructorDemo {
	 static String str="Hello";
	
	ConstructorDemo(){
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
		
	}
	ConstructorDemo(String str){
		System.out.println("I am a constructor with String parameter "+str);
	}
	ConstructorDemo(String str, int num){
		System.out.println("I am constructor with two parameters:"+ str +" and "+num);
	}
	public static void main(String[]args) {
		ConstructorDemo obj=new ConstructorDemo();
		System.out.println(str);
		ConstructorDemo obj1=new ConstructorDemo("Today is Java class");
		ConstructorDemo obj3= new ConstructorDemo("Yes", 13);
	}


}
