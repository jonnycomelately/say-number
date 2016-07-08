package com.dave.saynumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class SayHundredsTest {

	@Test 
	public void testSay3DigitNumbers() {
		assertEquals("twenty two", SayHundreds.sayHundreds("22"));
		assertEquals("thirteen", SayHundreds.sayHundreds("13"));
		assertEquals("ninety nine", SayHundreds.sayHundreds("99"));
		assertEquals("six", SayHundreds.sayHundreds("6"));
		assertEquals("fourty five", SayHundreds.sayHundreds("45"));
				
		assertEquals("one hundred and one", SayHundreds.sayHundreds("101"));
		assertEquals("one hundred and twenty", SayHundreds.sayHundreds("120"));
		assertEquals("three hundred and twenty six", SayHundreds.sayHundreds("326"));
		assertEquals("five hundred", SayHundreds.sayHundreds("500"));
	}	

}
