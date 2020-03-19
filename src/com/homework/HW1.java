package com.homework;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		 
			    Scanner i=new Scanner(System.in);
			    int x=i.nextInt();
			    System.out.println("Please enter your mark");
			    char grade;
			    if (x>=1&&x<25){
			      grade='F';
			    }else if (x>=25&&x<45){
			      grade='E';
			    }else if (x>=45&&x<50){
			      grade='D';
			    }else if (x>=50&&x<60){
			      grade='C';
			    }else if (x>=60&&x<=80){
			      grade='B';
			    }else if (x>80){
			      grade='A';
			      System.out.println("Yoyr grade is "+grade);
			    
			  }else{
			    System.out.println("Please enter valid mark");
			  }
			  
			}}

