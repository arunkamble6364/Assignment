package com.exceptions.exception8;

import java.util.Scanner;

public class StrongPassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter password");

		// PasswordException p = new PasswordException(null)
		String pass = sc.next();
		int len = pass.length();

		int num = 0, count = 0, lowercase = 0, uppercase = 0, specialchar = 0;

		for (int i = 0; i < len; i++) {
			int ascii = pass.charAt(i);
			if (ascii >= 48 && ascii <= 57) {
				num++;
			} else if (ascii >= 97 && ascii <= 122) {
				lowercase++;
			} else if (ascii >= 65 && ascii <= 122) {
				uppercase++;
			} else {
				specialchar++;
			}

		}
		if (num == 0) {
			count++;
		}

		if (lowercase == 0) {
			count++;
		}
		if (uppercase == 0) {
			count++;
		}
		if (specialchar == 0) {
			count++;
		}

		try {
			if (num >= 2 && lowercase >= 2 && uppercase >= 2 && specialchar >= 2) {
				System.out.println("Password is strong");
				if (count >= 8 && count <= 14) {

				}
			} else {
				throw new PasswordException("password should contain at least 2 capital letters, "
						+ "2 small letters, 2 digits and 2 special characters");
			}
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e);
			System.out.println("PasswordFormatException: password not as per requirement");
		}

	}
}
