package com.syntax.class10;

public class task {

	public static void main(String[] args) {
		
		//String [] animals= {"Dog", "Lion", "Tiger", "Cat", "Bison", "Girafee"};
		//for (int i=0; i<animals.length; i++) {
		//	System.out.print(i+" ");
			
			
		//	for(String x:animals) {
		//	System.out.println(x);
			
			
			int[] numbers= {2,4,6,8,9};
			int sum=0;
			for (int i:numbers) {
				
				sum+=i;
			
				System.out.println(sum);}
		

			String[] countries = {"Russia", "usa", "Italy", "China"};
			for (String x:countries) {
				if(x=="Russia") {
					System.out.println("Moscow");
					
				}if(x=="usa") {
					System.out.println("Washington DC");
				}if (x=="Italy") {
					System.out.println("Rome");
				}if(x=="China") {
					System.out.println("Beijing");
				}
				
			}
			}
			
}
			

