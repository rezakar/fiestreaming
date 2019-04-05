package howToUseArray;

import java.util.HashMap;

public class HashMapCharRepeateCount {
	public static void hashMapCharRepeate() {
		String s = "phonebook";
		Character mostRepeated = ' ';
		int max = 0;
		HashMap<Character, Integer> hashMap = new HashMap();
		for (int i = 0; i < s.length(); i++) {
			Character currentChar = s.charAt(i);
			if (hashMap.containsKey(currentChar)) {
				// increment current value for this key in hashMap by 1
				hashMap.put(currentChar, hashMap.get(currentChar) + 1);
			} else {
				// if we haven't added it to the hashMap, then put it in with the value
				hashMap.put(currentChar, 1);
			}
			for (Character key : hashMap.keySet()) {
				int currentValue = hashMap.get(key);
				if (currentValue > max) {
					mostRepeated = key;
					max = currentValue;
				}
			}
		}
		System.out.println("Most repeated: " +mostRepeated +" | Times: " + max);
		System.out.println(hashMap);
	}
}
