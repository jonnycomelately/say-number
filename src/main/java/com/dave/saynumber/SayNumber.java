package com.dave.saynumber;

public class SayNumber {
	
	private SayNumber() {
		
	}
	
	public static String sayNumber(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("This function only handles positive number for now...");
		}
		
		return sayNumber(Integer.toString(number));
	}
	
	private static String sayNumber(String number) {
		if (number.equals("0")) {
			return SayDigit.sayDigit('0');
		}
		
		StringBuilder builder = new StringBuilder();
	
		builder.append(sayHundreds(number));
		
		return builder.toString();
	}
	
	/** 
	 * Says a number in the range 0 -> 999
	 * @param number
	 * @return
	 */
	private static String sayHundreds(String number) {
		if (number.length() > 3) {
			throw new IllegalArgumentException("This function can only say 3 digit numbers");
		}
		
		StringBuilder builder = new StringBuilder();
	
		int nextDigitIndex = 0;
		boolean sayAnd = false;
		if (number.length() == 3) {
			builder.append(SayDigit.sayDigit(number.charAt(nextDigitIndex)));
			builder.append(" hundred");
			
			sayAnd = true;
			nextDigitIndex++;
		}
		
		if (number.length() > 1) {
			String doubleDigits = doubleDigitsToEnglish(number, nextDigitIndex);
			
			if (sayAnd && doubleDigits.isEmpty() == false) {
				builder.append(" and ");
			}
			
			builder.append(doubleDigits);
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
