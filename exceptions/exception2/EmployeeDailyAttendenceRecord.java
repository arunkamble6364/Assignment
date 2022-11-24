package com.exceptions.exception2;

import java.util.Scanner;

public class EmployeeDailyAttendenceRecord {
	public static void main(String[] args) throws LeaveExceedLimitException {
		Scanner sc = new Scanner(System.in);
		Salary s = new Salary();
		int basic = 25000;

		System.out.println("Enter Attendance as per following format P for present,"
				+ " L for leave it will be paid leave, A for absent,"
				+ " N for no information about this day --- for the mention dates in number");
		int emp_salary = 30000;
		String atten[] = new String[31];
		int p = 0;
		int a = 0;
		int l = 0;
		int n = 0;
		for (int i = 1; i < 30; i++) {

			System.out.print("Attendance for " + i);
			atten[i] = sc.next();
			if (atten[i].equals("P")) {
				p++;

			} else if (atten[i].equals("L")) {
				l++;

			} else if (atten[i].equals("A")) {
				a++;

			} else if (atten[i].equals("N")) {
				n++;

			}
		}

		System.out.println("Your total working days are " + p);
		try {
			if (l > 2 || n < 4) {
				// System.out.println("Your leaves exceed 2");
				s.calculateTotal(basic);
				// throw new LeaveExceedLimitException("LeaveExceedLimitException");

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			if (l > 2) {
				System.out.println("Your leaves exceed 2");
				// s.calculateTotal(basic);
				throw new LeaveExceedLimitException("LeaveExceedLimitException");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			if (n >= 4) {
				System.out.println("its been " + n + " days, with no information");
				System.out.println("Your salary will not be calculated");
				throw new LeaveExceedLimitException("EmployeeAbscondingException");
			}

		} catch (LeaveExceedLimitException e) {
			System.out.println(e.getMessage());
		}

	}
}
