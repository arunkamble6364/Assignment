package com.array;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i != 0 && j != 0) && (i != n - 1 && j != n - 1)) {
					System.out.print("   ");
					continue;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
