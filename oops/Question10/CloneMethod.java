package com.oops.Question10;

public class CloneMethod {
	public static void main(String[] args) throws CloneNotSupportedException {

		Product pro1 = new Product(101, "xyz", 2000, "Kilo Gram");

		Product pro2 = (Product) pro1.clone();
		pro2.setPname("abc");
		pro2.setPrice(3000);

		System.out.println(pro2);
		if (pro2 instanceof Product) {

			System.out.println("Objects are same");
		}

	}

}
