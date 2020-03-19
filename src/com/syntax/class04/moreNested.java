package com.syntax.class04;

public class moreNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isFriday = false;
		int date = 13;

		if (isFriday) {
			System.out.println("Today is Friday");
			if(date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch comedy");
			}

		} else {
			System.out.println("Today is not Friday, I am staying home");
		}
		
		boolean allergy=false;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false;
		if(allergy) {
			System.out.println("Please answer bellow");
			if(orangeAllergy) {
				System.out.println("Do not eat oranges");
			}
		}else {
			System.out.println("you are healthy");
		}
		boolean quizComp=true;
		int score=86;
		if (quizComp) {
			System.out.println("Let's check your score");
			if(score>90) {
				System.out.println("Great job");
			}else if(score>80) {
				System.out.println("well done!");
			}else if(score>70) {
				System.out.println("Could be better");
			}else {
				System.out.println("You failed");
			}
			
		}else {
			System.out.println("Please complete HW on time");
		}

	}

}
