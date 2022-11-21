package com.array;

public class VowelsAndConstantsTogether {

	public static void main(String[] args) {

		String str = "yashtechnology";
		char[] a = str.toCharArray();

		System.out.print("The consonants are ");

		System.out.print("{");

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {

				continue;
			}

			System.out.print(a[i] + ",");

		}

		System.out.print("}");

		System.out.println();

		System.out.print("The vowels are ");

		System.out.print("{");

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {

				System.out.print(a[i] + ",");

			}
		}
		System.out.print("}");
	}

}
