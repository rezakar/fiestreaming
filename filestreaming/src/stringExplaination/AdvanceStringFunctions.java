package stringExplaination;



public class AdvanceStringFunctions {
	
	public static void advanceStringFunction()
	{
		String text = "The giant panda has an insatiable appetite" +
					"for bamboo. Atypical animal eats half the day-a" +
					"full 12 out of every 24 hors-and relieves itself " + 
					"dozens of times a day. It takes 28 pounds of " + 
					"bamboo to satisfy a giant panda's daily dietray " +
					"needs. Panda will sometimes eat birds or rodents" + 
					" as well.";
		//How Many sentences?
		String[] sentences = text.split("\\.");
		System.out.println("The text has " + sentences.length + " sentences");
		//How many words?
		String[] words = text.split(" ");
		System.out.println("the taxt has " + words.length + "words");
		System.out.println(text.length());
		String fishText = text.replace("bamboo", "fish");
		System.out.println(fishText);
	}
	public static void main(String[] args) {
		String text = "The giant panda has an insatiable appetite" +
				"for bamboo. Atypical animal eats half the day-a" +
				"full 12 out of every 24 hors-and relieves itself " + 
				"dozens of times a day. It takes 28 pounds of " + 
				"bamboo to satisfy a giant panda's daily dietray " +
				"needs. Panda will sometimes eat birds or rodents" + 
				" as well.";
		//advanceStringFunction();
		FindVowelsAndConsonants.FindNumberOfVowelsAndConsonant(text);
	}
	}

