package com.synatx.class16;

public class LocalVariabls {
	void name() {
		String name="John";//local variable
		
	}public static void main(String[]args) {
		//name variable will not be visible here
		
		boolean flag=true;
		if(flag) {
			String answer="Yes";
		System.out.println(answer);//variable answer is not visible outside if block
	}}

}
