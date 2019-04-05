package howToUseArray;

import java.util.HashMap;

public class HashMapInUse {
	public static void hashMapInUse() {
		HashMap<String, Integer> wordToNum = new HashMap();
		wordToNum.put("One", 1);
		wordToNum.put("Two", 2);
		wordToNum.put("Three", 3);
		wordToNum.put("four", 4);
		wordToNum.put("Five", 5);
		System.out.println("Key number Three!" + wordToNum.get("Three"));
		System.out.println("All the Values! " + wordToNum.values());
		System.out.println("All the kys! " + wordToNum.keySet());
		System.out.println("Delete key Four! " + wordToNum.remove("four"));
	}
}
