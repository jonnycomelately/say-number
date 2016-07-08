package com.dave.saynumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class SayDigitTest {

	@Test
	public void testSayDigit() {
		assertEquals("zero", SayDigit.sayDigit('0'));
		assertEquals("one", SayDigit.sayDigit('1'));
		assertEquals("two", SayDigit.sayDigit('2'));
		assertEquals("three", SayDigit.sayDigit('3'));
		assertEquals("four", SayDigit.sayDigit('4'));
		assertEquals("five", SayDigit.sayDigit('5'));
		assertEquals("six", SayDigit.sayDigit('6'));
		assertEquals("seven", SayDigit.sayDigit('7'));
		assertEquals("eight", SayDigit.sayDigit('8'));
		assertEquals("nine", SayDigit.sayDigit('9'));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSayDigit_NonDigitCharacterThrows()
	{
		SayDigit.sayDigit('a');
	}
	
	@Test
	public void testSayTeenDigit() {
		assertEquals("ten", SayDigit.sayTeenDigit('0'));
		assertEquals("eleven", SayDigit.sayTeenDigit('1'));
		assertEquals("twelve", SayDigit.sayTeenDigit('2'));
		assertEquals("thirteen", SayDigit.sayTeenDigit('3'));
		assertEquals("fourteen", SayDigit.sayTeenDigit('4'));
		assertEquals("fifteen", SayDigit.sayTeenDigit('5'));
		assertEquals("sixteen", SayDigit.sayTeenDigit('6'));
		assertEquals("seventeen", SayDigit.sayTeenDigit('7'));
		assertEquals("eighteen", SayDigit.sayTeenDigit('8'));
		assertEquals("nineteen", SayDigit.sayTeenDigit('9'));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSayTeenDigit_NonDigitCharacterThrows()
	{
		SayDigit.sayDigit('Y');
	}
	
	@Test
	public void testSayTensDigit() {
		assertEquals("twenty", SayDigit.sayTensDigit('2'));
		assertEquals("thirty", SayDigit.sayTensDigit('3'));
		assertEquals("fourty", SayDigit.sayTensDigit('4'));
		assertEquals("fifty", SayDigit.sayTensDigit('5'));
		assertEquals("sixty", SayDigit.sayTensDigit('6'));
		assertEquals("seventy", SayDigit.sayTensDigit('7'));
		assertEquals("eighty", SayDigit.sayTensDigit('8'));
		assertEquals("ninety", SayDigit.sayTensDigit('9'));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSayTensDigit_NonDigitCharacterThrows()
	{
		SayDigit.sayTensDigit('Y');
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSayTensDigit_0DigitThrows()
	{
		SayDigit.sayTensDigit('0');
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSayTensDigit_1DigitThrows()
	{
		SayDigit.sayTensDigit('1');
	}	
	
	
}
