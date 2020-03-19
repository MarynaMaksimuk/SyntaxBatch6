package com.syntax.class07;

public class task {

	public static void main(String[] args) {
		boolean workDay=true;
		int day=7;
		while(workDay) {
			if(day>=1 && day<6) {
				System.out.println("I need a day off");
			}else if(day>=6 && day<=7) {
				System.out.println("I do not need day off any more");
			}workDay=false;
			
		}
		

}}
