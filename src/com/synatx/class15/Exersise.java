package com.synatx.class15;

public class Exersise {

	  int sum=0;
	  int sumEvenToX (int x){
	    for (int i=1; i<=x; i++){
	      if (i%2==0){
	        sum=sum+i;
	      }
	    }return sum;
	  }
	  public static void main(String[]args){
	    Exersise even=new Exersise();
	    System.out.println(even.sumEvenToX(5));
	  }
	  
	  
	  
	}
	  