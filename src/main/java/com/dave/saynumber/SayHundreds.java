package com.dave.saynumber;

public class SayHundreds {
	
	private static final String _HUNDRED = " hundred";
	private static final String AND_ = "and ";
	private static final String _AND_ = " and ";
	
	private SayHundreds() {
		
	}
	
	/** 
	 * Says a number in the range 0 -> 999
	 * @param number 
	 * @return
	 */
	public static String sayHundreds(String number) {
		if (number.length() > 3 || number.length() == 0) {
			throw new IllegalArgumentException("This function can only say 1, 2 or 3 digit numbers");
		}
		
		StringBuilder builder = new StringBuilder();

		String andString = "";
			
		int nextDigitIndex = 0;
		if (number.length() == 3) {
			char ch = number.charAt(nextDigitIndex);
			if (ch != '0') {
				builder.append(SayDigit.sayDigit(ch));
				builder.append(_HUNDRED);
				andString = _AND_;
			}
			else {
				andString = AND_;
			}
			
			nextDigitIndex++;
		}
		 
		if (number.length() > 1) {
			String doubleDigits = doubleDigitsToEnglish(number, nextDigitIndex);
			
			if (doubleDigits.isEmpty() == false) {
				builder.append(andString);
				builder.append(doubleDigits);
			}
			
		}
		else if (number.length() == 1) {
			builder.append(saySingleDigit(number, 0));
		}

		return builder.toString();
	}

	private static String doubleDigitsToEnglish(String number, int offset)
	{
		char digit = number.charAt(offset);
		
		if (digit == '0') {
			return saySingleDigit(number, offset +1);
		}
		
		if (digit == '1') {
			return SayDigit.sayTeenDigit(number.charAt(offset +1));
		}
		else {
			String lastDigit = saySingleDigit(number, offset +1);
			if (lastDigit.isEmpty()) {
				return SayDigit.sayTensDigit(number.charAt(offset));
			}
			else {
				return SayDigit.sayTensDigit(number.charAt(offset)) + " " + lastDigit;
			}
		}
	}
	
	private static String saySingleDigit(String number, int offset)
	{
		char digit = number.charAt(offset);
		if (digit != '0') {
			return SayDigit.sayDigit(digit);
		}
		else {
			return "";
		}
	}		
}
