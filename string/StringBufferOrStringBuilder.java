package com.string;

public class StringBufferOrStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long Time = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Arun");
		for (int i = 0; i < 10000; i++) {
			sb.append("Kamble");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - Time) + "ms");

		Time = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Arun");
		for (int i = 0; i < 10000; i++) {
			sb2.append("Kamble");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - Time) + "ms");
	}

}
