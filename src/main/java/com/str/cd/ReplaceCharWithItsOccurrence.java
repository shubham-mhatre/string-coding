package com.str.cd;

import java.util.Arrays;

public class ReplaceCharWithItsOccurrence {

	public static void main(String[] args) {
		
		String input ="leo messi is greatest player of all time";

		char characterToReplace='e';
		
		//check if character to replace is available or not.
		if(input.indexOf(characterToReplace) == -1) {
			System.out.println("character to replace  ' "+  characterToReplace +" ' is not available in input string");
			System.exit(0);
		}
		
		//replaceTestWithOccurrence(input,characterToReplace);
		
		usingReplaceFirstMethod(input,characterToReplace);
		
	}

	private static void usingReplaceFirstMethod(String input, char characterToReplace) {
		char[] charArry=input.toCharArray();
		
		int count=1;
		for(int i=0;i<charArry.length;i++) {
			if(charArry[i]==characterToReplace) {
				input= input.replaceFirst(String.valueOf(characterToReplace), String.valueOf(count));
				count++;
			}
		}
		
		System.out.println(input);
	}

	//charAt(0) will not work when character repeated are more than 10, avoid using this solution
	private static void replaceTestWithOccurrence(String input, char characterToReplace) {
		char[] inputArr = input.toCharArray();
		
		int count=1;
		for(int i=0;i<inputArr.length;i++) {
			if(inputArr[i] == characterToReplace) {
				inputArr[i] = String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(inputArr);
	}

}
