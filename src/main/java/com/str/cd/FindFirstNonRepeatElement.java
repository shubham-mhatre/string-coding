package com.str.cd;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatElement {

	public static void main(String[] args) {
		String input="AABBBCCCCDDEF";
		
		withoutUsingCollection(input);
		
		usingCollectionMap(input);

	}

	/**
	 * iterate on each element
	 * check if key already present in map.
	 * if key is present then get value against that key & increment it by 1
	 * then store that value against same key
	 * if key is not present in map then add key and value default count as 1
	 * after end of iteration, iterate on map entry
	 * get key who is having count as 1 and break loop as we only want 1st non-repeate element
	 */
	private static void usingCollectionMap(String input) {
		System.out.println("approach-2 : with using collection : MAP");
		
		Map<Character,Integer> charOccurrenceMap=new HashMap<>();
		for(int i=0;i<input.length();i++) {
			
			if(charOccurrenceMap.containsKey(input.charAt(i))) {
				int incrementCount=charOccurrenceMap.get(input.charAt(i)) + 1;
				charOccurrenceMap.put(input.charAt(i), incrementCount);
			}else {
				charOccurrenceMap.put(input.charAt(i), 1);
			}			
						
		}		
		System.out.println(charOccurrenceMap);
		
		for(Entry<Character, Integer> entry : charOccurrenceMap.entrySet()) {
			
			if(entry.getValue() == 1) {
				System.out.println("1st non-repeated character is : "+ entry.getKey());
				break;
			}
		}
		
	}

	/**
	 * 
	 * take inner & outer loop both starting from 0th index & iterate on each element.
	 * i!=j condition to skip matching with of element from both the loop.
	 * take unique boolean flag in outer loop 
	 * & in inner loop if char of i & char of j matched then set unique flag to false
	 * and break inner loop. and in outer look check if flag is unique then print element
	 * and break outer loop as well as we want only 1st repeated element.
	 * 
	 */
	private static void withoutUsingCollection(String input) {
		System.out.println("approach-1 : without using collection");
		char[] charArr=input.toCharArray();		
		for(int i=0;i < charArr.length;i++) {
			boolean unique=true;
			for(int j=0; j<charArr.length;j++) {
				if(i!=j && charArr[i] == charArr[j]) {
					unique=false;
					break;
				}
			}			
			if(unique) {
				System.out.println("1st unique element is "+charArr[i]);
				break;
			}
		}		
	}

}
