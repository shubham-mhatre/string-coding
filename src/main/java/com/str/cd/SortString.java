package com.str.cd;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String input="java";
		
		//approach-1
		withoutUsingSortMethod(input);
		
		String input1="xyzhsjjfdasj";
		//approach-2
		usingSortMethod(input1);
	}

	private static void usingSortMethod(String input) {
		char[] charArray=input.toCharArray();		
		Arrays.sort(charArray);
		System.out.println(new String(charArray));		
	}

	private static void withoutUsingSortMethod(String input) {		
		char[] charArray = input.toCharArray();		
		char temp;
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i] > charArray[j]) {
					temp = charArray[i];
					charArray[i]=charArray[j];
					charArray[j] =temp;					
				}
			}			
		}
		System.out.println(new String(charArray));		
	}
}
