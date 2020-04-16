package com.homework;

public class MainTestInt implements Main{
	 
	public void display(double result){
	      System.out.print("Result is : : : ");
	}public static void main(String[] args) {
		Main obj=new MainTestInt();
	    double result=100+70;
	    obj.display(result);
	    System.out.println(result);
	    double result1=100-70;
	    obj.display(result);
	    System.out.println(result1);
	}
	
}
