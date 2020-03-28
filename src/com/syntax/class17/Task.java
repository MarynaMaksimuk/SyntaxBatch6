package com.syntax.class17;

public class Task {
	 int result=0;
	 int sum(int [] a) {
		
		for (int i=0; i<a.length; i++) {
			result+= a[i];
		}return result;
	}
	public static void main(String[]args) {
		Task s=new Task();
		int []array = {2,5,7,89};
		System.out.println(s.sum(array));
		
	}

}
