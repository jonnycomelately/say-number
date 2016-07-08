package com.dave.saynumber;


public class SayNumber {
	
	private static final String MILLION = "million";
	private static final String THOUSAND = "thousand";
	
	private SayNumber() {
	}
	
	public static String sayNumber(int number) {

		if (number < 0 || number > 999_999_999) {
			throw new IllegalArgumentException("Only numbers in the range 0 to 999,999,999 are accepted");
		}
		
		return sayNumber(Integer.toString(number));
	}
	
	private static String sayNumber(String number) {
		if (number.equals("0")) {
			return SayDigit.sayDigit('0');
		}
		
		int [] groups = hundredsSepartorPositions(number.length());
		StringBuilder builder = new StringBuilder();
		
		int index = 0;
		int magnitude = groups.length;
		for (int groupSize : groups) {						
			String group = number.substring(index, index + groupSize);
			
			String english = SayHundreds.sayHundreds(group);
			// the digits 000 will return an empty string
			if (!english.isEmpty())
			{
				builder.append(english).append(" ");
				// add the thousands/millions
				builder.append(groupMagnitudeString(magnitude)).append(" ");
			}
			
			
			index += groupSize;
			magnitude--;
		}
		
		// remove trailing space
		return builder.toString().trim();
	}
	
	
	private static String groupMagnitudeString(int magnitude)
	{
		switch (magnitude) {
		case 3: return MILLION;
		case 2: return THOUSAND;
		default:
			return "";
		}
	}
	
	
	/**
	 * Get the position of groups of digits where the ',' hundred 
	 * separator would go.<br> 
	 * For example 1,200 has 2 groups of size [1, 3].
	 * 20,000,000 has 3 groups of size [2, 3, 3]
	 * 
	 * @param numberLength The number of digits in the number
	 * @return
	 */
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
