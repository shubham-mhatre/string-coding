package com.str.cd;

public class ReverseEachWord {

	public static void main(String[] args) {
		String input="JAVA DOCS";
		String delimeter=" ";
		reverseEachWord(input,delimeter);
	}

	/**
	 * first split each words by delimeter, here in our case it is space.
	 * after split, we will get array.
	 * iterate on each array as outer loop.
	 * again to iterate on each character or word have inner loop.
	 * in inner loop start from last character, so length-1 as initial i value
	 * iterate till i becomes 0 and decrement i--
	 * append each letter of word in inner loop
	 * in outer loop append each word with delimiter
	 * 
	 */
	private static void reverseEachWord(String input, String delimeter) {
		String[] wordArray=input.split(delimeter);
		
		String output="";
		for(String word:wordArray) {			
			String reverseWord="";
			for(int i=word.length()-1 ;i >=0;i--) {
				reverseWord=reverseWord + word.charAt(i);
			}
			output = output + reverseWord + delimeter;
		}
		
		System.out.println(output);
	}

}
