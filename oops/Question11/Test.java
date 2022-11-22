package com.oops.Question11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = formatter.parse("30/10/1996");
			//System.out.println("Date is: " + date);
			Date date1 = formatter.parse("08/09/2021");
			Employee employee = new Employee(1, "abc", 120000.00, "pune", date, date1);
			System.out.println(employee);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
