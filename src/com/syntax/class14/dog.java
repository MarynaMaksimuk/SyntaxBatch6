package com.syntax.class14;

public class dog {
	String breed;
	String color;
	String name;
	int age;
	
	

	public static void main(String[] args) {
		dog dog1 = new dog();
		dog1.breed="Labrador";
		dog1.color="brown";
		dog1.name="Jay";
		dog1.age=2;
		
		dog dog2 = new dog();
		dog2.breed="Bulldog";
		dog2.color="black";
		dog2.name="Sasha";
		dog2.age=5;
		
		dog1.bark();
		dog1.run();

	}

        void eat() {
	System.out.println("Dog can eat");
}
        void bark() {
        	System.out.println(name+" Dog can bark");}
        void run() {
        	System.out.println(name+ " Dog can run");
        }
        }
