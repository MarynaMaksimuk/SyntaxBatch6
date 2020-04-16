package com.homework;

import java.util.ArrayList;

public class Drinks {
	public static void main(String[] args) {
		
	
	ArrayList <String> drinks=new ArrayList<String>();
	drinks.add("beer");
	drinks.add("tequila");
	drinks.add("wiskey");
	drinks.add("lemonade");
	System.out.println(drinks);
	
	for (int i=0; i<drinks.size(); i++) {
		if (drinks.get(i).contains("e")) {
			drinks.set(i, "water");
			
			
		}
	}System.out.println(drinks);

}}
