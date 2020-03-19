package com.syntax.class06;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner i=new Scanner(System.in);
		    System.out.println("Input a number between 1-12");
		    int x=i.nextInt();
		    String y;
		    switch (x){
		      case 1:
		    	  y="January";
		    	  break;
		      case 2:
		    	  y="February";
		    	  break;
		      case 3:
		    	  y="March";
		    	  break;
		      case 4:
		    	  y="April";
		    	  break;
		      case 5:
		    	  y="May";
		    	  break;
		      case 6:
		    	  y="June";
		    	  break;
		      case 7:
		    	  y="July";
		    	  break;
		      case 8:
		    	  y="August";
		    	  break;
		      case 9:
		    	  y="September";
		    	  break;
		      case 10:
		    	  y="October";
		    	  break;
		      case 11:
		    	  y="November";
		    	  break;
		      case 12:
		    	  y="December";
		    	  break;
		        default:
		        	y="Invalid";}
		    System.out.println(y);
		  }}
		  
		