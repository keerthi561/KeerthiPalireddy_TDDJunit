package com.epam.RemoveA;

public class RemoveA {

	public String remove(String string) {
		int stringLength = string.length();
		if (string.charAt(0) == 'A'  && string.charAt(1) == 'A')
			return string.substring(2, stringLength);
		else if (string.charAt(0) == 'A')  {
			return string.substring(1, stringLength);
		} else if (string.charAt(1) == 'A') {
			return string.charAt(0) + string.substring(2, stringLength);
		} else {
			return string;
		}
	}

}
