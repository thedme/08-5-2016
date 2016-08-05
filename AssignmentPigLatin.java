package com.piglatin;

import java.util.Scanner;

public class AssignmentPigLatin {

	public static void main(String[] args) {
		//int x =5;
		//while (x == 5) {
			
			// TODO Auto-generated method stub
			
			System.out.println("Please enter the number of words to translate.");
			Scanner alien = new Scanner(System.in);
			Scanner numInput = new Scanner(System.in);
			int arrayEllements = numInput.nextInt();
			String[] wordsInASentence = new String[arrayEllements];
			

			for (int i = 0; i <  arrayEllements; i ++)
			{
				
			
			
			System.out.println("Please enter your  words " + (i +1) +":");
			wordsInASentence[i] = alien.nextLine();
			wordsInASentence[i] = wordsInASentence[i].toLowerCase();
			}
			
			for(int i = 0; i < wordsInASentence.length; i++)
			{
				StringBuilder modifiedWordsInASentence = new StringBuilder(wordsInASentence[i]);
				char firstLetter = modifiedWordsInASentence.charAt(0);
				
				if (theFirstLetterIsAVowel(firstLetter)) {
					modifiedWordsInASentence.append("ay");
					System.out.println(modifiedWordsInASentence);
				} else {
					modifiedWordsInASentence.append(firstLetter + "ay");
					modifiedWordsInASentence.deleteCharAt(0);
					System.out.print(modifiedWordsInASentence +" ");
					
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