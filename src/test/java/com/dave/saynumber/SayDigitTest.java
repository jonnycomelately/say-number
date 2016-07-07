package com.dave.saynumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class SayDigitTest {

	@Test
	public void testSayDigit() {
		SayDigit sayer = new SayDigit();
		
		assertEquals("zero", sayer.sayDigit('0'));
		assertEquals("one", sayer.sayDigit('1'));
		assertEquals("two", sayer.sayDigit('2'));
		assertEquals("three", sayer.sayDigit('3'));
		assertEquals("four", sayer.sayDigit('4'));
		assertEquals("five", sayer.sayDigit('5'));
		assertEquals("six", sayer.sayDigit('6'));
		assertEquals("seven", sayer.sayDigit('7'));
		assertEquals("eight", sayer.sayDigit('8'));
		assertEquals("nine", sayer.sayDigit('9'));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSayDigit_NonDigitCharacterThrows()
	{
		new SayDigit().sayDigit('a');
	}
	
	@Test
	public void testSayTeenDigit() {
		SayDigit sayer = new SayDigit();
		
		assertEquals("ten", sayer.sayTeenDigit('0'));
		assertEquals("eleven", sayer.sayTeenDigit('1'));
		assertEquals("twelve", sayer.sayTeenDigit('2'));
		assertEquals("thirteen", sayer.sayTeenDigit('3'));
		assertEquals("fourteen", sayer.sayTeenDigit('4'));
		assertEquals("fifteen", sayer.sayTeenDigit('5'));
		assertEquals("sixteen", sayer.sayTeenDigit('6'));
		assertEquals("seventeen", sayer.sayTeenDigit('7'));
		assertEquals("eighteen", sayer.sayTeenDigit('8'));
		assertEquals("nineteen", sayer.sayTeenDigit('9'));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSayTeenDigit_NonDigitCharacterThrows()
	{
		new SayDigit().sayDigit('Y');
	}
	
	@Test
	public void testSayTensDigit() {
		SayDigit sayer = new SayDigit();
		
		assertEquals("twenty", sayer.sayTensDigit('2'));
		assertEquals("thirty", sayer.sayTensDigit('3'));
		assertEquals("fourty", sayer.sayTensDigit('4'));
		assertEquals("fifty", sayer.sayTensDigit('5'));
		assertEquals("sixty", sayer.sayTensDigit('6'));
		assertEquals("seventy", sayer.sayTensDigit('7'));
		assertEquals("eighty", sayer.sayTensDigit('8'));
		assertEquals("ninety", sayer.sayTensDigit('9'));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSayTensDigit_NonDigitCharacterThrows()
	{
		new SayDigit().sayTensDigit('Y');
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSayTensDigit_0DigitThrows()
	{
		new SayDigit().sayTensDigit('0');
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSayTensDigit_1DigitThrows()
	{
		new SayDigit().sayTensDigit('1');
	}	
	
	
}
