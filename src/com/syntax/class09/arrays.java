package com.syntax.class09;



public class arrays {

	public static void main(String[] args) {
		int[] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		System.out.println(array[1]);
		
		
		// 2 way to  declare
		
		String[] carArray;//preferable
		String carArray1[];
		carArray=new String[3];
		carArray[0]="BMW";
		carArray[1]="Honda";
		carArray[2]="Toyota";
		
		System.out.println("I am driving "+carArray[2]);
		
		
			
	}

}
