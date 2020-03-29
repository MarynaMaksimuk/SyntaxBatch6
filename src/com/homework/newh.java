package com.homework;

public class newh {
	
	  private static int numb;
	  
	  public newh(){
	    numb++;
	    
	  }
	  public static int counter() {
		  return numb;
	  }
	  public static void main(String []args){
		  newh obj=new newh();
		  newh obj1=new newh();
		  newh obj2=new newh();
		  
	    System.out.println(obj.numb);
	    
	    }
	  }