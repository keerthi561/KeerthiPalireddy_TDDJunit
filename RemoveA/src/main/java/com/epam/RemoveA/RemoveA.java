package com.epam.RemoveA;

public class RemoveA {

	public String remove(String string) {
		String result = "";
		int stringLength = string.length();
		if (string.charAt(0) == 'A'  && string.charAt(1) == 'A')
			result  = string.substring(2, stringLength);
		else if (string.charAt(0) == 'A')  {
			result  = string.substring(1, stringLength);
		} else if (string.charAt(1) == 'A') {
			result  = string.charAt(0) + string.substring(2, stringLength);
		} else {
			result  = string;
		}
		return result;
	}

}
