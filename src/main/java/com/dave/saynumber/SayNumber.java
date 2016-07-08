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
	
		builder.append(SayHundreds.sayHundreds(number));
		
		return builder.toString();
	}
	
	
	
	static int [] hundredsSepartorPositions(int numberLength)
	{
		final int GROUP_LENGTH = 3;
		int numGroups = ((numberLength + GROUP_LENGTH -1) / GROUP_LENGTH);
		int [] result = new int[numGroups];
		
		int numDigitsInFirstGroup = numberLength % 3;
		if (numDigitsInFirstGroup == 0) {
			numDigitsInFirstGroup = 3;
		}
		result[0] = numDigitsInFirstGroup;
		
		for (int i=1; i<numGroups; i++)
		{
			result[i] = 3;
		}
		
		return result;
	}
}
