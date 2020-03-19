package com.synatx.class12;

public class SplitFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----aplit function");
		
		String today="Today is my favorite Java class";
			String[] array=today.split("my");
			System.out.println(array.length);
			System.out.println(array[0]);
			System.out.println(array[1]);
			
			String today1="Today is my favorite Java class";
			String[] stringArray=today1.split("a");
			for (String arr:stringArray) {
				System.out.println(arr+" ");
			}

	}

}
