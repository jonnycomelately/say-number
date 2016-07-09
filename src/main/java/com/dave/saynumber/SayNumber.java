package com.dave.saynumber;

/**
 * Renders a number in the range 0 - 999,999,999 in English.
 * 
 * The algorithm is based on the observation that the 3 digit
 * groups between the thousand separators are said the same way 
 * e.g. 'one hundred and 2'. The final string is then built by
 * appending the appropriate magnitude ('millions', 'thousands')
 * between the groups and putting the 'and's in the correct place.
 */
public class SayNumber {
	
	private static final String MILLION = "million";
	private static final String THOUSAND = "thousand";
	private static final int THOUSANDS_GROUP_LENGTH = 3;
	
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
		
		// split the number into groups where the thousands separators go
		int [] groups = thousandsSepartorPositions(number.length());
		StringBuilder builder = new StringBuilder();
		
		int index = 0;
		int magnitude = groups.length;
		
		// say each group
		for (int groupSize : groups) {						
			String group = number.substring(index, index + groupSize);
			
			String english = SayHundreds.sayHundreds(group);
			// the digits 000 will return an empty string
			if (!english.isEmpty())
			{
				// add the thousands/millions 
				builder.append(english).append(" ");
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
	 * Get the position of groups of digits where the ',' thousands 
	 * separator would go.<br> 
	 * For example 1,200 has 2 groups of size [1, 3].
	 * 20,000,000 has 3 groups of size [2, 3, 3]
	 * 
	 * @param numberLength The number of digits in the number
	 * @return
	 */
	// visible for testing - I can't use guava for the annotation 
	static int [] thousandsSepartorPositions(int numberLength)
	{		
		int numGroups = (numberLength + THOUSANDS_GROUP_LENGTH -1) / THOUSANDS_GROUP_LENGTH;
		int [] result = new int[numGroups];
		
		int numDigitsInFirstGroup = numberLength % THOUSANDS_GROUP_LENGTH;
		if (numDigitsInFirstGroup == 0) {
			numDigitsInFirstGroup = THOUSANDS_GROUP_LENGTH;
		}
		result[0] = numDigitsInFirstGroup;
		
		for (int i=1; i<numGroups; i++)
		{
			result[i] = THOUSANDS_GROUP_LENGTH;
		}
		
		return result;
	}
}
