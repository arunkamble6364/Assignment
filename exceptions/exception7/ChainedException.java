package com.exceptions.exception7;

import java.io.IOException;

public class ChainedException {

	public static void main(String[] args) {
		try {

			NumberFormatException ex = new NumberFormatException("Exception");

			ex.initCause(new NullPointerException("This is actual cause of the exception"));

			throw ex;
		}

		catch (NumberFormatException ex) {

			System.out.println(ex);

			System.out.println(ex.getCause());
		}
	}

}
