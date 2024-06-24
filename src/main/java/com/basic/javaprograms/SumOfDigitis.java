package com.basic.javaprograms;

public class SumOfDigitis {
	
	public static int sumOfDigits (int number) {
		if (number == 0 ) {
			return 0;
		}
		if (number == 1) {
			return 1;
		}
		int sum = 0;
		while (number !=0) {
			int digit = number %10;
			sum = sum + digit;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(3));

	}

}
