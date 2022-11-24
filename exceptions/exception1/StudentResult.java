package com.exceptions.exception1;

import java.util.Scanner;

public class StudentResult {
	int science;
	int math;
	int physics;
	int chemistry;
	int total;
	
	Scanner sc = new Scanner(System.in);
	public void checkResult() throws Exception
	{
		System.out.println("Enter science mark");
		science = sc.nextInt();
		System.out.println("Enter math mark");
		math=sc.nextInt();
		System.out.println("Enter physics mark");
		physics=sc.nextInt();
		System.out.println("Enter chemistry mark");
		chemistry=sc.nextInt();
		
		total=((science+math+physics+chemistry)*100/400);
		System.out.println(total);
		
		if(science<0||math<0||physics<0||chemistry<0)
		{
			throw new NegativeMarksException("Negative Input");
		}
		
		if(science<35||math<35||physics<35||chemistry<35)
		{
			throw new FailInOneSubject("fail in more than one subjecy");
		}
		if(total<(160*100)/400)
		{
			throw new FailExeption("Fail");
		}
		
	}
	public static void main(String[] args) throws Exception {
		StudentResult sr = new StudentResult();
		sr.checkResult();
	}
}
