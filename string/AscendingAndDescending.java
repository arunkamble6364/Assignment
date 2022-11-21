package com.string;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("in ascending order");

		String str = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		System.out.println("In descending order");

		String str1 = "abcdefghijklmnopqrstuvwxyz";
		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.println(str1.charAt(i));
		}

	}

}
