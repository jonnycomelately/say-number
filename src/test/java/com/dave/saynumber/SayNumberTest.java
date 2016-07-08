package com.dave.saynumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class SayNumberTest {
	
	@Test
	public void testWorldPayTestCases() {
		assertEquals("zero", SayNumber.sayNumber(0));
		assertEquals("one", SayNumber.sayNumber(1));
		assertEquals("twenty one", SayNumber.sayNumber(21));
		assertEquals("one hundred and five", SayNumber.sayNumber(105));
		assertEquals("one hundred and twenty three", SayNumber.sayNumber(123));
		assertEquals("one thousand and five", SayNumber.sayNumber(1005));
		assertEquals("one thousand and forty two", SayNumber.sayNumber(1042));
		assertEquals("one thousand one hundred and five", SayNumber.sayNumber(1105));
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", SayNumber.sayNumber(56_945_781));
		assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", SayNumber.sayNumber(999_999_999));
	}		

	@Test(expected=IllegalArgumentException.class)
	public void testNegativeNumbersArntAccepted() {
		SayNumber.sayNumber(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNumbers_GreaterThanOrEqualToABillionThrows() {
		SayNumber.sayNumber(1_000_000_000);
	}
	
	@Test
	public void testSayZero() {
		assertEquals("zero", SayNumber.sayNumber(0));
	}
	
	@Test
	public void testSayThousandsAnMillions() {
		assertEquals("one thousand", SayNumber.sayNumber(1000));
		assertEquals("two thousand five hundred and one", SayNumber.sayNumber(2501));
		assertEquals("one hundred and twenty five thousand five hundred and one", SayNumber.sayNumber(125_501));
		assertEquals("sixty million one hundred and twenty five thousand five hundred and one", SayNumber.sayNumber(60_125_501));
		assertEquals("ninety million", SayNumber.sayNumber(90_000_000));
		assertEquals("seventeen", SayNumber.sayNumber(17));
	}	
	
	@Test
	public void testhundredsSepartorPositions() {
		int [] groups = SayNumber.hundredsSepartorPositions("5".length());
		assertEquals(1, groups.length);
		assertEquals(1, groups[0]);
		
		groups = SayNumber.hundredsSepartorPositions("20".length());
		assertEquals(1, groups.length);
		assertEquals(2, groups[0]);		
		
		groups = SayNumber.hundredsSepartorPositions("500".length());
		assertEquals(1, groups.length);
		assertEquals(3, groups[0]);		
		
		groups = SayNumber.hundredsSepartorPositions("20000".length());
		assertEquals(2, groups.length);
		assertEquals(2, groups[0]);			
		assertEquals(3, groups[1]);			
		
		groups = SayNumber.hundredsSepartorPositions("2000000".length());
		assertEquals(3, groups.length);
		assertEquals(1, groups[0]);			
		assertEquals(3, groups[1]);			
		assertEquals(3, groups[2]);			
	}	
}
