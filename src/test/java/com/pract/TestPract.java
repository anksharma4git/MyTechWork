package com.pract;

import java.util.Scanner;

public class TestPract {

	public static void main(String args[]) throws Exception {

		String stringToTest1 = "Qi8cRMlBaHAn9obi5lzl";
		char[] strArray1 = stringToTest1.toCharArray();
		System.out.println(convertString(strArray1));

		for (int i = 97; i < 123; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int stringSize = scanner.nextInt();
			scanner.nextLine();
			String stringToTest = scanner.nextLine();
			char[] strArray = stringToTest.toCharArray();
			System.out.println(convertString(strArray));
		}
		scanner.close();
	}

	private static String convertString(char[] strArray) {

		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = convertAsciiToChar(findNearestPrime(((int) strArray[i])));
		}
		return new String(strArray);
	}

	private static char convertAsciiToChar(int ascii) {
		return (char) ascii;

	}

	private static int findNearestPrime(int number) {

		int positiveIndex = getPrimeNumberIndex(number, true);
		int negativeIndex = getPrimeNumberIndex(number, false);
		int nearestPrime = number;

		boolean isNegativeApproved = checkForCoverage(number - negativeIndex);
		boolean isPositiveApproved = checkForCoverage(number + positiveIndex);

		if (positiveIndex == negativeIndex) {
			if (isPositiveApproved && isNegativeApproved) {
				nearestPrime = number - negativeIndex;
			}else if (!isNegativeApproved && isPositiveApproved) {
				nearestPrime = number + positiveIndex;
			} else if (!isPositiveApproved && isNegativeApproved) {
				nearestPrime = number - negativeIndex;
			}
		} else {

			if (isPositiveApproved && isNegativeApproved) {
				nearestPrime = positiveIndex > negativeIndex ? number - negativeIndex : number + positiveIndex;
			} else if (!isNegativeApproved && isPositiveApproved) {
				nearestPrime = number + positiveIndex;
			} else if (!isPositiveApproved && isNegativeApproved) {
				nearestPrime = number - negativeIndex;
			}
		
		}

		return nearestPrime;

	}

	private static boolean checkForCoverage(int nearestPrime) {

		return (nearestPrime >= 65 && nearestPrime <= 90) || (nearestPrime >= 97 && nearestPrime <= 122) ? true : false;

	}

	private static int getPrimeNumberIndex(int origNumber, boolean isAdd) {

		int index = 0;
		boolean primeFound = false;

		if ((origNumber < 67 && !isAdd) || (origNumber > 113 && isAdd)) {
			return 100000;
		}

		do {
			int number = isAdd ? origNumber + index : origNumber - index;

			if (isPrime(number) && checkForCoverage(number)) {
				primeFound = true;
				break;
			}
			index++;

		} while (!primeFound);

		return index;
	}

	private static boolean isPrime(int number) {

		boolean isPrime = true;
		for (int i = 2, j = number - 1; i < number / 2; i++, j--) {
			if (number % i == 0 || number % j == 0) {
				isPrime = false;
				return isPrime;
			}
		}
		return isPrime;

	}

}
