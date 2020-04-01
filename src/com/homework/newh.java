package com.homework;

public class newh {
	
	static String mixString(String s1, String s2){
	    StringBuilder mix=new StringBuilder();
	    for (int i=0; i<s1.length(); i++) {
	    	mix.append(s1.charAt(i));
	    	mix.append(s2.charAt(i));
	    }String result=mix.toString();
	    return result;
	    }
		
		
		//test case below (dont change):
		public static void main(String[] args){
		  String firstValue = mixString("12345","abcde"); 
			System.out.println(firstValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
		}
	}