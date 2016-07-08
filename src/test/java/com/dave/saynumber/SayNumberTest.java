package com.dave.saynumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class SayNumberTest {

	@Test
	public void testSayZero() {
		assertEquals("zero", SayNumber.sayNumber(0));
	}
	
	@Test
	public void testSayThousands() {
		assertEquals("two five hundred and one", SayNumber.sayNumber(2501));
		assertEquals("one hundred and twenty five five hundred and one", SayNumber.sayNumber(125501));
		assertEquals("sixty one hundred and twenty five five hundred and one", SayNumber.sayNumber(60125501));
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
