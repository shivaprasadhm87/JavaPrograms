package com.basic.javaprograms;

/**
 * A class to compute the factorial of a given number.
 */
public class FactorialofANumber {
    
    /**
     * Computes the factorial of the given number.
     * @param number The number for which to calculate the factorial.
     * @return The factorial of the input number.
     */
    public static int factorialNumber(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        // Calculate and print the factorial of 9
        System.out.println("Factorial of 9: " + factorialNumber(9));
    }
}
