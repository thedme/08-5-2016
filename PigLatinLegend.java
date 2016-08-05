package com.piglatin;

import java.util.Scanner;

public class PigLatinLegend {
	private static boolean pigLatin = true;
	
	public static void main(String[] args) {
		while(pigLatin = true)
		{
			Scanner userInput = new Scanner(System.in);
			
				
				System.out.println("\nType your sentence to be translated ");
			String UserInput1 = userInput.nextLine();
			String[] UserSentence = UserInput1.split("\\s");
			
			
			for(int i = 0; i < UserSentence.length; i++)
			{
				StringBuilder modifiedWordsInASentence = new StringBuilder(UserSentence[i]);
				char firstLetter = modifiedWordsInASentence.charAt(0);
				
				if (theFirstLetterIsAVowel(firstLetter)) {
					modifiedWordsInASentence.append("ay"+ " ");
					System.out.print(modifiedWordsInASentence);
				} else {
					modifiedWordsInASentence.append(firstLetter + "ay" );
					modifiedWordsInASentence.deleteCharAt(0);
					System.out.print(modifiedWordsInASentence +" ");
				}
			}
		}
	
	}
			public static boolean theFirstLetterIsAVowel(char firstLetter)
			{
				char[] vowel = {'a','e','i','o','u'};
				boolean isThisAVowel = false;
				for(int i = 0;i < vowel.length; i++)
				{
					if(firstLetter == vowel[i])
					{
						isThisAVowel = true;
					}
				}
					return isThisAVowel;
				
			}
}

