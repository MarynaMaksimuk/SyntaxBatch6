package com.syntax.class10;

public class advancedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {200,30,-1,900,56,787};
		int maxNumber=nums[0];
		
		for (int i=0; i<nums.length; i++) {
			
			if (nums[i]>maxNumber) {
			maxNumber=nums[i];
			System.out.println(nums[i]);
		}
		}}}


