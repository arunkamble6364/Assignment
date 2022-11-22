package com.oops.Question8;

public class Test {
	public static void main(String[] agrs) {
		Electronic mobile = new Mobile("1", "Integrated Circuit", "1993");
		mobile.ElectronicDisplay();

		Electronic lcd = new LCD("2", "Crystal Display", "2017");
		lcd.ElectronicDisplay();

		Electronic laptop = new Laptop("3", "PCB", "1956");
		laptop.ElectronicDisplay();

	}
}
