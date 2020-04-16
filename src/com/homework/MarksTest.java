package com.homework;

public class MarksTest {
	public static void main(String[] args) {
		Marks x=new A(70,80,95);
		System.out.println("Average grade of student A is "+x.getPercentage()+" %");
		Marks y=new B(80,80,90,98);
		System.out.println("Average grade of student B is "+y.getPercentage()+" %");
		
	}

}
