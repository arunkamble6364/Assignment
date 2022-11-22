package com.oops.Question6;

import java.util.Scanner;

public class Largestof4No {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = 0,num2 = 0;
		   System.out.println("Enter the first Number");
		   int a= sc.nextInt();
		   System.out.println("Enter the second Number");
		   int b= sc.nextInt();
		   System.out.println("Enter the third Number");
		   int c= sc.nextInt();
		   System.out.println("Enter the fourth Number");
		   int d= sc.nextInt();
		   
		   if(a>b)
		   {
			   num1=a;
		   }
		   else
		   {
			   num1=b;
		   }
		   if(c<d)
		   {
			  num2=c; 
		   }
		   else
		   {
			   num2=d;
		   }
		   if(num1>num2)
		   {
			   System.out.println(num1);
		   }
		   else
		   {
			   System.out.println(num2);
		   }

	}
}
