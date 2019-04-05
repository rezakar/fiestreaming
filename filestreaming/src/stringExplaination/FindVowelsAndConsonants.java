package stringExplaination;

public class FindVowelsAndConsonants {
	public static void FindNumberOfVowelsAndConsonant(String input) {
		int vowelsCount = 0;
		int consonantCount = 0;
		String vowels = "aeiouy";
		String normalized = (input.toLowerCase()).trim();
		char[] inputArray = normalized.toCharArray();
		for (char c: inputArray) {
			if (vowels.indexOf(c) != -1) {
				vowelsCount++;
			}else if ( c != ' ') {
				consonantCount++;
			}
		}
		System.out.println("There are " + vowelsCount + 
				" vowels in " + input);
		System.out.println("There are " + consonantCount + 
				" consonants in " + input);
	}
}
