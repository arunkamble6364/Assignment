package com.oops.Question2;

import java.util.Scanner;

public class Rectangle implements Shape {
	@Override
	public void area() 
	{
		double width, height, Area, Perimeter;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please Enter the Width of a Rectangle =  ");
		width = sc.nextDouble();
		System.out.println(" Please Enter the Height of a Rectangle = ");
		height = sc.nextDouble();

		Area = width * height;
		//Perimeter = 2 * (width + height);

		System.out.format(" The Area of a Rectangle = %.2f\n",Area);
		//System.out.format(" The Perimeter of a Rectangle = %.2f\n", Perimeter);
		
	}

}
