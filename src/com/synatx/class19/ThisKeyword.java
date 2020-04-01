package com.synatx.class19;

public class ThisKeyword {
	int a;
	int b;
	
	public ThisKeyword(int a, int b) {
		this.a=a;
		this.b=b;
						
	}
	public ThisKeyword() {
		System.out.println("I am non argument constructor");
	}
	public void sum(int a, int b) {
		System.out.println("Sum of local variables "+(a+b));
		System.out.println("Sum of instatnce variables "+(this.a+this.b));
	}
	private void DisplayInfo() { // we can call method inside another method
		sum(2,5);
	}
	public static void main(String[]args) {
		ThisKeyword obj=new ThisKeyword(10,20);
		obj.sum(100, 200);
		ThisKeyword obj2=new ThisKeyword();
		obj2.sum(20,40);
	}
	}


