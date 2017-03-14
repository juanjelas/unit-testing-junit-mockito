package com.unittesting.chp03;

public class StringUtils {

	public static String reverse(String s) {
		StringBuilder reverse = new StringBuilder(s);
		return reverse.reverse().toString();
	}
}
