package test.one;
import java.util.Scanner;

public class VowelConsontants {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter all the 26 english alphabets (a-z):");
		
		char alphabets[] = new char[26];
		
		String vowel = "";
		String consonant = "";
		
		for (int i= 0; i < alphabets.length; i++) {
			alphabets[i] = input.next().charAt(0);
			
		}
		for (int i= 0; i < alphabets.length; i++) {
		
			if(alphabets[i] == 'a' || alphabets[i] == 'e' || alphabets[i] == 'i'|| alphabets[i] == 'o' || alphabets[i] == 'u') {
				vowel = vowel + alphabets[i] + ", ";
			}
			else {
				consonant = consonant + alphabets[i] + ", ";
			}
		}
		System.out.println("The vowels are: " + vowel);
		System.out.print("The consonants are: " + consonant);	

	}

}
