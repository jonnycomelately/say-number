package com.dave.saynumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class SayNumberTest {

	@Test
	public void testSayZero() {
		assertEquals("zero", SayNumber.sayNumber(0));
	}

	@Test 
	public void testSay3DigitNumbers() {
		assertEquals("twenty two", SayNumber.sayNumber(22));
		assertEquals("thirteen", SayNumber.sayNumber(13));
		assertEquals("ninety nine", SayNumber.sayNumber(99));
		assertEquals("six", SayNumber.sayNumber(6));
		assertEquals("fourty five", SayNumber.sayNumber(45));
				
		assertEquals("one hundred and one", SayNumber.sayNumber(101));
		assertEquals("one hundred and twenty", SayNumber.sayNumber(120));
		assertEquals("three hundred and twenty six", SayNumber.sayNumber(326));
		assertEquals("five hundred", SayNumber.sayNumber(500));
	}	
	
	@Test
	public void testSayThousands() {
		assertEquals("two thousand", SayNumber.sayNumber(2000));
	}	
}
