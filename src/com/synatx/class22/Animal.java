package com.synatx.class22;

public class Animal {
	public void eat() {
		System.out.println("animal eat");
	}public void sleep() {
		System.out.println("animal sleep");
	}

}class Tiger extends Animal{
	public void eat() {
		System.out.println("Tiger eats a lot");
	}
}
