package com.syntax.class18;

public class Students {
	Students(String name, int grade1, int grade2, int grade3, int grade4, int grade5){
		int average=(grade1+grade2+grade3+grade4+grade5)/5;
		System.out.println(name+" average grade is "+average);
	}public static void main (String[]args) {
		Students student1=new Students("Bob", 80, 87,90,75,89);
		Students student2=new Students("Mary", 60, 55,90,70,81);
		Students student3=new Students("Jorge", 73, 83,96,70,84);	
	}

}
