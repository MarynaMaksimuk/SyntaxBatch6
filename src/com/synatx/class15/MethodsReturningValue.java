package com.synatx.class15;

public class MethodsReturningValue {
	public static void main(String[]args) {
		String str="Hello my friend";
		int length=str.length();
		 if (length>10) {
			 System.out.println("String is long");
		 }else {
			 System.out.println("String is short");
		 }
		 //compare two number and after that we will identify whether largest number is even or odd
		 
		 MethodsReturningValue obj=new MethodsReturningValue();
		 int x= obj.largest(10, 20);
		 boolean flag=obj.isOdd(x);
		 char grade=obj.mark(75);
		 System.out.println(grade);
		 
	}
	// create a method that returns largest number from two given numbers
	
	int largest(int a, int b) {
		int largest;
		if (a>b) {
			largest=a;
		}else {
			largest=b;
		}return largest;
	}
	boolean isOdd (int num){
		
		boolean isOdd;
		if (num%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}return isOdd;
	}

 // creat a method that will accept marks and will return grades

		char mark(int a) {
			char grade;
			if(a>90) {
				grade='A';
			}else if (a<=90 && a>80) {
				grade='B';
			}else if (a<=80 && a>70) {
				grade='C';
			}else {
				grade='F';
			}return grade;
			
}}