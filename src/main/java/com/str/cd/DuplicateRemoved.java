package com.str.cd;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoved {

	public static void main(String[] args) {
		String input="programming";
		
		//approach 1 : using java 8 stream
		usingJava8Stream(input);
		
		//approach 2 : using indexOf()
		usingIndexOf(input);
		
		//approach 3 : using characterToArray()
		usingCharacterArray(input);

		usingSet(input);
	}

	/**
	 * set not save duplicate, 
	 * so call add method and save character in set
	 * 
	 */
	private static void usingSet(String input) {
		Set<Character> setChar = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for(Character ch : input.toCharArray()) {
			setChar.add(ch);
		}
		
		for(Character ch : setChar) {
			sb.append(ch);
		}
	}

	private static void usingCharacterArray(String input) {
		char[] charArray=input.toCharArray();
		StringBuilder output=new StringBuilder();
		for(int i=0;i < input.length();i++) {// start from 1st	
			boolean repeated=false;
			for(int j=i+1; j < input.length(); j++) {// start from 2nd and go till end				
				if(charArray[i] == charArray[j]) {//check if 1st char is present till end
					repeated=true;//found then break inner loop
					break;
				}
			}
			if(!repeated) {//if 1st char is not repeated till end then add in final output
				output.append(charArray[i]);
			}
		}
		System.out.println(output);		
	}

	private static void usingIndexOf(String input) {		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			
			int indexPosition= input.indexOf(ch, i+1);//find character from given index (i+1) till end
			if(indexPosition == -1) {//positiion -1 means not found
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

	/**
	 * chars() -> convert to IntStream
	 * distinct() -> remove duplicate
	 * foreach & cast to char -> iterate and cast to char to display
	 */
	private static void usingJava8Stream(String input) {		
		StringBuilder sb = new StringBuilder();
		input.chars().distinct().forEach(s->sb.append((char) s));
		System.out.println(sb);
	}

}
