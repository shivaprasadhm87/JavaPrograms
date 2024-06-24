package com.basic.javaprograms;

public class ReverseAStringwithoutStringBuilder {
	
	public static String reverseString(String str) {
		if (str.length() == 0) {
			return "String is invalid";
		}
			char[] str1 = str.toCharArray();
			System.out.println(str1);
			return str1.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("Shiva");

		
	}

}
