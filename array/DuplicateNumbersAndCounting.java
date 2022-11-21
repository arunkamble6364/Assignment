package com.array;

public class DuplicateNumbersAndCounting {

	public static void main(String[] args) {

		int[] a = { 3, 2, 4, 5, 4, 3 };
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					
					System.out.println(a[j]+"  ");

					count++;

				}
			}
		}

		System.out.println("duplicate count= " + count);

	}

}
