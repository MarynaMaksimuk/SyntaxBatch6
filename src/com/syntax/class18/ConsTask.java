package com.syntax.class18;

public class ConsTask {
	ConsTask(){
		System.out.println("Constructor withount parameters");
	}ConsTask(int num){
		System.out.println("Constructor with int parameter "+num);
	}
	public static void main(String[]args) {
		ConsTask obj=new ConsTask();
		ConsTask obj1=new ConsTask(54);
		
	}

}
