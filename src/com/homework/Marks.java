package com.homework;

public abstract class Marks {
	int grade1;
	int grade2;
	int grade3;
	int grade4;

	Marks(int grade1, int grade2, int grade3, int grade4) {
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade4 = grade4;
	}

	Marks(int grade1, int grade2, int grade3) {
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	abstract double getPercentage();

}

class A extends Marks {
	A(int grade1, int grade2, int grade3) {
		super(grade1, grade2, grade3);
	}

	@Override
	double getPercentage() {
		double average = ((grade1 + grade2 + grade3) / 3);
		return average;
	}
}
	class B extends Marks {
		B(int grade1, int grade2, int grade3, int grade4) {
			super(grade1, grade2, grade3, grade4);
		}

		@Override
		double getPercentage() {
			double average1 = ((grade1 + grade2 + grade3 + grade4) / 4);
			return average1;
		}

	}


