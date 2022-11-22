package com.oops.Question7;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first String");
	String s1=scan.next();
	char[] c1=s1.toCharArray();
	System.out.println("Enter Second String");
	String s2=scan.next();
	char[] c2=s2.toCharArray();
		int count=0;	
	if(c1.length==c2.length) {
	for(int i=0;i<c1.length;i++) {
		
		Character l1=c1[i];
		Character l2=c2[i];
		if(l1.equals(l2)) {
			count++;
			if(count==c2.length) {
				System.out.println("Strings are equal");
				break;
			}
		}
		else {
			System.out.println("Strings are not equal");
			break;
		}
	}
	}
	else {
	System.out.println("Strings are not equal");}
}
}
