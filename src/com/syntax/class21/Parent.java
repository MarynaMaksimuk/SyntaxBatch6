package com.syntax.class21;

public class Parent {
	String name="John";
	
	void hello() {
		System.out.println("I am parent class method");
	}
	

}class Child extends Parent{
	String name="Lily";
	
	public void display() {
		System.out.println(name);
		System.out.println(super.name);
	}
	void sayHello() {
		display();
		hello();
		super.hello();
	}
}
