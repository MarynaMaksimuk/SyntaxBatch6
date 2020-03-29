package com.syntax.class18;

public class task {
	// static task(){ error
	public task() {
		System.out.println("Public constructor");
	}

	task(int num) {
		System.out.println("Default constructor");
	}

	protected task(int num1, int num2) {
		System.out.println("protected");
	}

	private task(String str) {
		System.out.println("private constructor");
	}

	public static void main(String[] args) {
		task obj = new task();
		task obj1 = new task(3);
		task obj2 = new task(3, 6);
		task obj3 = new task("Hi");
	}
}
