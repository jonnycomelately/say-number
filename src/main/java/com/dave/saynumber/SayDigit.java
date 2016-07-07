package com.dave.saynumber;

/**
 * Class to numerical convert digit characters to english words.
 */
public class SayDigit {
	
	public String sayDigit(char digit) {
		
		switch (digit) {
		case '0': return "zero"; 
		case '1': return "one";
		case '2': return "two";
		case '3': return "three";
		case '4': return "four";
		case '5': return "five";
		case '6': return "six";
		case '7': return "seven";
		case '8': return "eight";
		case '9': return "nine";
		default:
			throw new IllegalArgumentException(digit + " is not a number");
		}
	}
	
	public String sayTeenDigit(char digit) {
		
		switch (digit) {
		case '0': return "ten"; 
		case '1': return "eleven";
		case '2': return "twelve";
		case '3': return "thirteen";
		case '4': return "fourteen";
		case '5': return "fifteen";
		case '6': return "sixteen";
		case '7': return "seventeen";
		case '8': return "eighteen";
		case '9': return "nineteen";
		default:
			throw new IllegalArgumentException(digit + " is not a number");
		}
	}
	
	public String sayTensDigit(char digit) {
		
		if (digit == '0' || digit == '1')
		{
			throw new IllegalArgumentException("No english for " + digit + " as a multple of 10");
		}
		
		switch (digit) {
		case '2': return "twenty";
		case '3': return "thirty";
		case '4': return "fourty";
		case '5': return "fifty";
		case '6': return "sixty";
		case '7': return "seventy";
		case '8': return "eighty";
		case '9': return "ninety";
		default:
			throw new IllegalArgumentException(digit + " is not a number");
		}
	}	

}
