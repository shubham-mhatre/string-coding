package com.str.cd;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceOfEachElement {

	public static void main(String[] args) {

		String input="ZYYXXXAABCCDDDDEFGHH";

		usingMap(input);

	}

	/** using LinkedHashMap to maintain insertion order correctly
	 * iterate on each element
	 * check if key already present in map.
	 * if key is present then get value against that key & increment it by 1
	 * then store that value against same key
	 * if key is not present in map then add key and value default count as 1
	 */
	private static void usingMap(String input) {
		Map<Character,Integer>occurrenceMap=new HashMap<>();
		char[] charArr=input.toCharArray();
		for(int i=0;i<charArr.length;i++) {			
			if(occurrenceMap.containsKey(charArr[i])) {
				int prevCount= occurrenceMap.get(charArr[i]);
				int updatedCount=prevCount +1;
				occurrenceMap.put(charArr[i], updatedCount);
			}else {
				occurrenceMap.put(charArr[i],1);
			}
		}
		System.out.println(occurrenceMap);
	}

}
