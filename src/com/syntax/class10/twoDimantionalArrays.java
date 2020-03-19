package com.syntax.class10;

public class twoDimantionalArrays {

	public static void main(String[] args) {
		int [][] nums= {
						{10,20,30,40},
						{5,10,15,20},
						{1,2,3,4}
						};
		String [][] months = {
					{"January", "February", "March"},
					{ "April","May", "June"},
					{"July","August", "September"},
					{"October","November", "December"}
				
		};
		int rows=months.length;//how many rows
		System.out.println(rows);
		int firstArray=months[0].length;//how many items in 0th row
		System.out.println(firstArray);
		
		for (int i=0; i<months.length; i++) {
			for (int j=0; j<months[i].length; j++) {
				System.out.print(months[i][j]);
			}System.out.println();
		}

	}}
