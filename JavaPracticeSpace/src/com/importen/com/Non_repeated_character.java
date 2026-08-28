package com.importen.com;

public class Non_repeated_character {

	public static void main(String[] args) {
		
		//Find the first non-repeated character in a String.
		
		String word = "swissi";

		int count[] = new int[236];

		for (int i = 0; i < word.length(); i++) {

			count[word.charAt(i)]++;
		}
		
		
		for (int i = 0; i < word.length(); i++) {
		    if (count[word.charAt(i)] == 1) {
		        System.out.println("First Non-Repeated: " +count[word.charAt(i)]);
		        break;
		    }
		}
		
		/*
		 * “நான் 256 size array பயன்படுத்தியதற்கு காரணம், input-ல் ASCII characters
		 * மட்டுமே இருக்கும் என்று assume செய்தேன். ASCII character values 0 முதல் 255
		 * வரை இருக்கும். அதனால் ஒவ்வொரு character-க்கும் count store செய்ய 256 size
		 * array போதுமானது.”
		 */
	}

}
