package com.syntax.class13;

public class Q3 {

	public static void main(String[] args) {
		// Write java program to print first 10 numbers of Fibounachi
		
		int a,b,c;
		a=0;
		b=1;
		for (int i=1; i<=10; i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}

	}

}
