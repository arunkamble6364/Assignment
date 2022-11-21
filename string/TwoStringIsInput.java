package com.string;

import java.util.Scanner;

public class TwoStringIsInput {
	public static String insertString(String originalString, String stringToBeInserted, int index) {

		// Create a new string
		String newString = new String();

		for (int i = 0; i < originalString.length(); i++) {

			// Insert the original string character into the new string
			newString += originalString.charAt(i);

			if (i == index) {

				// Insert the string to be inserted into the new string
				newString += stringToBeInserted;
			}
		}

		// return the modified String
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st String");
		String originalString = sc.next();
		System.out.println("Enter 2nd String to be Inserted");
		String stringToBeInserted = sc.next();
		System.out.println("Enter Index No. where to be inserted");
		int index = sc.nextInt();

		System.out.println("Original String: " + originalString);
		System.out.println("String to be inserted: " + stringToBeInserted);
		System.out.println("String to be inserted at index: " + index);

		// Insert the String
		System.out.println("Modified String: " + insertString(originalString, stringToBeInserted, index));

	}

}
