//CharAt Length Equals

package prob2;

import java.util.Scanner;

public class Prob2 {
	
	public static int countVowelSequences(String str) {
		int vowels = 0;
		int totalPairs = 0;
		
		if(vowels == 2)
			totalPairs = totalPairs + 1;
			vowels = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
			vowels = vowels + 1;
			}
		}
		return totalPairs;
	}

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String str = console.next(); 
		
		System.out.println(countVowelSequences(str));
		

	}

}
