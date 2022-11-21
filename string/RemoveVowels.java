package com.string;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "shailesh";

		char[] c = str1.toCharArray();

		String s = "";

		for (int i = 0; i < c.length; i++) {

			if (c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u') {
				s = s + c[i];
			}
		}
		System.out.println("removing vowels : " + s);

	}

}
