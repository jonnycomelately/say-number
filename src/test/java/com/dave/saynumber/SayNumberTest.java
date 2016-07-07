package com.dave.saynumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class SayNumberTest {

	@Test
	public void testSayZero() {
		assertEquals("zero", new SayNumber().sayNumber(0));
	}

	@Test 
	public void testSay3DigitNumbers() {
		assertEquals("twenty two", new SayNumber().sayNumber(22));
		assertEquals("thirteen", new SayNumber().sayNumber(13));
		assertEquals("ninety nine", new SayNumber().sayNumber(99));
		assertEquals("six", new SayNumber().sayNumber(6));
		assertEquals("fourty five", new SayNumber().sayNumber(45));
				
		assertEquals("one hundred and one", new SayNumber().sayNumber(101));
		assertEquals("one hundred and twelve", new SayNumber().sayNumber(112));
		assertEquals("three hundred and twenty six", new SayNumber().sayNumber(326));
		assertEquals("five hundred", new SayNumber().sayNumber(500));
	}
}
