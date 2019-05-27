package stringExplaination;

public class FindVowelsAndConsonants {
	public static void FindNumberOfVowelsAndConsonant(String input) {
		int vowelsCount = 0;
		int consonantCount = 0;
		String vowels = "aeiouy";
		String normalized = (input.toLowerCase()).trim();
		System.out.println(normalized);
		char[] inputArray = normalized.toCharArray();
		for (char c: inputArray) {
			if (vowels.indexOf(c) != -1) {
				vowelsCount++;
			}else if ( c != ' ') {
				consonantCount++;
			}
		}
		System.out.println("There are " + vowelsCount + 
				" vowels in " );
		System.out.println("There are " + consonantCount + 
				" consonants in " );
	}
	public static void main(String[] args) {
		String text = "The giant panda has an insatiable appetite" +
				"for bamboo. Atypical animal eats half the day-a" +
				"full 12 out of every 24 hors-and relieves itself " + 
				"dozens of times a day. It takes 28 pounds of " + 
				"bamboo to satisfy a giant panda's daily dietray " +
				"needs. Panda will sometimes eat birds or rodents" + 
				" as well.";
		
		FindVowelsAndConsonants.FindNumberOfVowelsAndConsonant(text);
	}
}
