package com.homework;

public class newh {
	
	public boolean isPalindrome(String s) {
		s=s.toLowerCase().replaceAll("[^a-z]", "");
	    String reverse="";
	    char []rev=s.toCharArray();
	    for (int i=rev.length-1; i >=0; i--) {
	    	reverse+=rev[i];
	        if ( reverse.equals(s) ) {
	            return true;
	        }
	    }
	    return false;
	}
		
		public static void main(String[] args){
		  newh obj=new newh();
		  System.out.println(obj.isPalindrome("Eva, Can I Stab Bats In A Cave"));
		  
		  newh obj2= new newh();
		  System.out.println(obj2.isPalindrome("text"));
		}
	}