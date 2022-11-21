package com.array;

public class EvenOddPerfectPrimeNumber {

	public void checkEvenNumber(int[] even) {
		String evenNumbers = "";
		for (int i = 0; i < even.length; i++) {
			if (even[i] % 2 == 0) {
				evenNumbers += even[i] + " ";
			}
		}
		System.out.println("even numbers = " + evenNumbers);
	}

	public void checkOddNumber(int[] odd) {
		String oddNumbers = "";
		for (int i = 0; i < odd.length; i++) {
			if (odd[i] % 2 != 0) {
				oddNumbers += odd[i] + " ";
			}
		}
		System.out.println("odd numbers = " + oddNumbers);
	}

	public void checkPerfectNumber(int[] perfect) {

		String perfectNum = "";
		for (int i = 0; i < perfect.length; i++) {
			int sum = 0;
			for (int j = 1; j <= perfect[i] / 2; j++) {
				if (perfect[i] % j == 0) {
					sum += j;
				}
			}
			if (perfect[i] == sum) {
				perfectNum += perfect[i] + " ";
			}
		}
		System.out.println("Perfect Numbers are = " + perfectNum);
	}

	public void checkPrimeNumber(int[] prime) {

		String primeNum = "";
		for (int i = 0; i < prime.length; i++) {
			int counter = 1;
			for (int j = 2; j <= prime[i]; j++) {
				if (prime[i] % j == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				primeNum += prime[i] + " ";
			}
		}
		System.out.println("prime numbers are= " + primeNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 66, 23, 4, 29, 88, 54, 45, 67, 28 };

		EvenOddPerfectPrimeNumber eopp = new EvenOddPerfectPrimeNumber();
		eopp.checkEvenNumber(arr);
		eopp.checkOddNumber(arr);
		eopp.checkPrimeNumber(arr);
		eopp.checkPerfectNumber(arr);

	}

}
