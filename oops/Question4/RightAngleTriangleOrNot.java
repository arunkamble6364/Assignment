package com.oops.Question4;

import java.lang.System.Logger;
import java.util.Arrays;
import java.util.Scanner;

public class RightAngleTriangleOrNot {

	static Scanner sc = new Scanner(System.in);

	public void run() {
		System.out.println("Input three integers(sides of a triangle)");
		int[] int_num = new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt() };
		Arrays.sort(int_num);
		System.out.println("If the given sides form a right triangle?");
		ln((int_num[2] * int_num[2] == int_num[0] * int_num[0] + int_num[1] * int_num[1]) ? "Yes" : "No");
	}

	public static void main(String[] args) {
		new RightAngleTriangleOrNot().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}
