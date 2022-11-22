package com.oops.Question6;

import java.util.Scanner;

public class LargestNumberExample {
	static  Scanner sc = new Scanner(System.in);
	   public void LargestNumberOF3()
	   {
		   int num1, num2, num3;  
		   System.out.println("Enter three integers: ");  
		   Scanner sc = new Scanner(System.in);  
		   num1=sc.nextInt();  
		   num2=sc.nextInt();  
		   num3=sc.nextInt();  
		   if (num1 > num2 && num1 > num3)  
		   System.out.println("The largest number is: "+num1);  
		   else if (num2 > num1 && num2 > num3)  
		   System.out.println("The largest number is: "+num2);  
		   else if (num3 > num1 && num3 > num2)  
		   System.out.println("The largest number is: "+num3);  
		   else  
		   System.out.println("The numbers are same.");  
	   }
	   
	   public void LargestNumberOF4()
	   {
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
