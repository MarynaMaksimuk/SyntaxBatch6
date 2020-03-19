package com.syntax.class10;

public class arraysRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] cities= {"washington", "New York", "Dallas", "Chicago", "Los Angeles"};
		int arraySize=cities.length;
		System.out.println(arraySize);
		
		
		for (int i=0; i<arraySize; i++) {
			System.out.println(cities[i]);
			
			// printing using advanced for loop(enhanced loop or for each loop)
			
			char[] grades= {'A','B','C','D','E'};
			for (int y=0; y<grades.length; y++) {
				System.out.println(y);
				System.out.println();
			}
			
			for (char grade:grades) {
				System.out.println(grade+" ");
			}
			// create array of fruits and retrive all elements
			
			String[] fruits= {"banana", "kiwi", "mango", "apple"};
			for(String fruit:fruits) {
				if(fruit.contentEquals("apple")) {
					System.out.println(fruit +" is my favorite fruit");
				}else {
				System.out.println(fruit);
			}}
		}

	}

}
