package com.basic.javaprograms;

public class PrimeNumber {

	public static boolean isAPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAPrime(97));
	}

}
