package com.synatx.class15;

public class Exersise {

	  String nameOfTheCountry, capital;
	  int population;
	  
	  void values (){
	   System.out.println("The capital of "+nameOfTheCountry+" is "+capital+" and population is "+population);
	    
	  }
	  public static void main(String[]args){
		  Exersise obj=new Exersise();
	    obj.nameOfTheCountry="USA";
	    obj.capital="Washington DC";
	    obj.population=330000000;
	    
	    obj.values();
	    
	    obj.nameOfTheCountry="Kazakhstan";
	    obj.capital="Astana";
	    obj.population=185000000;
	    
	    obj.values();
	   
	    
	  }
	  
	}