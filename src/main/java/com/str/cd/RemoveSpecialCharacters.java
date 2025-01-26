package com.str.cd;

//remove all special characters.
public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
		
		/**use replace method, regex is except operator at start
		 * so except alphanumeric replace all with empty 
		 * will give us plain string
		 */
		
		String input="i A@m Opt|imu$s Pr!ime";
		
		String plainStr = input.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(plainStr);

	}

}
