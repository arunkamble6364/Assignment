package com.oops.Question4;

import java.util.Scanner;

public class Area {
	static Scanner sc = new Scanner(System.in);

	public void areaofTriangle() {
		System.out.print("Enter the base: ");
		int base = sc.nextInt();
		System.out.print("Enter the height: ");
		int height = sc.nextInt();
		double area = (0.5) * (base * height);
		System.out.println("The area of Triangle is: " + area);
	}

	public void areaOfSquare() {
		double a, s;
		System.out.println("Enter the side of the Square:");
		s = sc.nextDouble();
		a = s * s;
		System.out.println("Area of the square is: " + a);
	}

	public void areOfRectangle() {
		double width, height, Area;

		System.out.println(" Please Enter the Width of a Rectangle =  ");
		width = sc.nextDouble();
		System.out.println(" Please Enter the Height of a Rectangle = ");
		height = sc.nextDouble();
		Area = width * height;
		System.out.format(" The Area of a Rectangle = %.2f\n", Area);

	}

	public static void main(String[] args) {
		int noOfSides;
		Area a = new Area();

		System.out.println("please Enter the sides of shape: ");
		System.out.println("please enter 1 if you want to print the area of Square");
		System.out.println("please enter 3 if you want to print the area of Triangle");
		System.out.println("please enter 2 if you want to print the area of Rectangle");
		noOfSides = sc.nextInt();
		if (noOfSides == 1) {
			a.areaOfSquare();
		} else if (noOfSides == 3) {
			a.areaofTriangle();

		} else {
			a.areOfRectangle();
		}

	}
}
