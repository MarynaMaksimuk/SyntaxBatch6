package com.synatx.class16;

public class MethodsRecap {
	int getLargestNumber(int[]array) {
		int largest=array[0];
		for (int i=1; i<array.length;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}return largest;
	}
		//create a method that will accept a string and return each work from the string
	
		String [] getWords(String str) {
			String[] array= str.split(" ");
			return array;
		}
		public static void main(String[]args) {
			MethodsRecap obj=new MethodsRecap();
			int []arr= {12,20,38,14};
			System.out.println(obj.getLargestNumber(arr));
			
			String myString="It is a beautiful world";
			String[] words=obj.getWords(myString);
			
			for (String str2:words) {
				System.out.println(str2);
			}
		}
}
