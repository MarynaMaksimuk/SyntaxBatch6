package com.synatx.class11;

public class arraysRecap {

	public static void main(String[] args) {
//		String [][] prof= {
//				{"QA testers","Developer","Pruduct Owner","Scrum master"},
//				{"Math teacher","Science teacher","ESL teacher"},
//				{"Dentist","Surgeon"}
//				};
//		// get elements using advanced for loop
//		
//		for (String [] occupation:prof) {
//			for(String occ:occupation) {
//				System.out.println(occ);
//			}System.out.println();
//		}
		int count=0;
		String[][] countries= {
				{"usa","canada","panama","honduras"},
				{"chile","argentina","peru","brasil"},
				{"china","north korea","thailand","india"},
				{"nigeria","kenya","morocco","south africa"}
		};
		for (String [] cont: countries) {
			for (String i:cont) {
				count++;
			
				System.out.println(i);}
			
		}System.out.println();
		System.out.println(count);
		
		
	
		
		
		
		
		
	}}