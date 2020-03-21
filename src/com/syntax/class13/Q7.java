package com.syntax.class13;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {
		// find second largest number in the array
		
		int [] num= {53,46,31,85,7,52};
		
		//sort the array
		Arrays.sort(num);
		System.out.println("Smallest is "+num[0]);
		System.out.println("The largest is "+num[num.length-1]);
		
		int smallest=num[0];
		int larg=num[0];
		int larg2=num[0];
		for (int i=1; i<num.length; i++) {
			int element=num[i];
			if (element>larg) {
				larg2=larg;
				larg=element;
			}else if (element>larg2 && element!=larg) {
					larg2=element;
				
				}if (element<smallest) {
					element=smallest;
				}}
		System.out.println("Smallst is "+ smallest);
		System.out.println("Biggest is "+larg);
		System.out.println("Second large "+larg2);

	}}
