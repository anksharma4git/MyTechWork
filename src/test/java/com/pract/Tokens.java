package com.pract;

public class Tokens {

	public static void main(String[] args) {

		int index = 8;
		String token = "ankitsharma";
		captureAtIndex(index, true, token);
	}

	private static void captureAtIndex(int index, boolean moveForward, String token) {

		if (index + 2 < token.length()) {
			char[] newCharArray = new char[token.length() - 1];

			char[] origCharArray = token.toCharArray();
			int cursor = moveForward ? +2 : -2;
			origCharArray[index + cursor] = origCharArray[index];
			int newSize = -1;
			for (int i = 0; i < token.length(); i++) {
				if (index != i) {
					newSize++;
					newCharArray[newSize] = origCharArray[i];
				}
			}

			System.out.println(new String(newCharArray));
		}
	}
}
