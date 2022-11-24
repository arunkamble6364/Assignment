package com.exceptions.exception10;

public class Child extends Parent {

	@Override
	void maximum(int a[]) throws NullPointerException, NumberFormatException {
		int sum = 0, length = a.length;
		for (int i = 0; i < a.length; i++) {

			sum += a[i];
		}
		super.maximum(a);
		System.out.println("Average is " + sum / length);
	}
}
