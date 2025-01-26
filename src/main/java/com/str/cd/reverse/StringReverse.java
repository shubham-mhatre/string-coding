package com.str.cd.reverse;

public class StringReverse {

	public static void main(String[] args) {
		
		String input="hello"; //output : olleh
		
		/**
		 * to reverse, read from last place, 
		 * last place can be computed by, length - 1
		 * iterate till reach 0
		 */
		
		//approach 1 : using toCharArray		
		usingToCharArray(input);
		
		System.out.println("");
		
		//approach 2 : using charAt
		usingCharAt(input);
		
		System.out.println("");
		
		//approach 3 : using StringBuilder reverse method
		usingStringBuilder(input);

		
		//approach 4 : using StringBuffer reverse method
		usingStringBuffer(input);

	}

	private static void usingStringBuffer(String input) {
		StringBuffer sbuffer = new StringBuffer(input);
		System.out.println(sbuffer.reverse());
	}

	private static void usingStringBuilder(String input) {
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse());
	}

	private static void usingCharAt(String input) {
		for(int i = input.length()-1; i >=0; i--) {
			System.out.print(input.charAt(i));
		}
	}

	private static void usingToCharArray(String input) {
		char[] charArray= input.toCharArray();
		
		for(int i = input.length()-1 ; i >=0 ; i--) {
			System.out.print(charArray[i]);
		}
	}

}
