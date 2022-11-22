package com.oops.Question2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// for triangle reading vertex
		Map<String, MyCoord> mt = new HashMap<String, MyCoord>();
		mt.put("point1", new MyCoord(10, 20));
		mt.put("point2", new MyCoord(20, 30));
		mt.put("point3", new MyCoord(10, 30));
		System.out.println("in Traingle");
		MyCoord mc = mt.get("point1");
		System.out.println("vertex A has these coordinates:- " + mc.getX() + " " + mc.getY());
		MyCoord mc1 = mt.get("point2");
		System.out.println("Vertex B vertex has these coordinates:- " + mc1.getX() + " " + mc1.getY());
		MyCoord mc2 = mt.get("point3");
		System.out.println("Vertex C vertex has these coordinates:- " + mc2.getX() + " " + mc2.getY());
		// calculate area of triangle
		Triangle t = new Triangle();
		t.area();

		// calculate are of rect
		Rectangle r = new Rectangle();
		r.area();

		// calculate area of square
		Square s = new Square();
		s.area();
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU:");
		System.out.println("1.Area of triangle ");
		System.out.println("2.Area of Square");
		System.out.println("3.Area of rectangle");
		System.out.println("Please enter any of the above option: ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Enter all the details plz:");
			t.area();
		case 2:
			System.out.println("Enter all the details plz:");
			s.area();

		case 3:
			System.out.println("Enter all the details plz:");
			r.area();

		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
	}
}
