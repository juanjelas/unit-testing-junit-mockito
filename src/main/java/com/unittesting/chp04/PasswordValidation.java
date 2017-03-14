package com.unittesting.chp04;

import java.util.regex.Pattern;

public class PasswordValidation {

	public boolean validation(String string) {
		if (string == null || string.length() < 6)
			return false;
		if (!Pattern.compile("[0-9]").matcher(string).find())
			return false;
		if (!Pattern.compile("[A-Z]").matcher(string).find())
			return false;
		return true;
	}

}
