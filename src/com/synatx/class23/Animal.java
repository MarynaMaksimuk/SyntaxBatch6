package com.synatx.class23;

public class Animal {
	public static void whoIam() {
		System.out.println("I am an animal");
	}
	public void sleep() {
		System.out.println("All animals sleep");
	}

}class Bird extends Animal{
	@Override
	public static void whoIam() {
		System.out.println("I am a bird");
	}public void sleep() {
		System.out.println("Birds sleep");
	}
}
