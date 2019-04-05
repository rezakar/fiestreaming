package howToUseArray;

import java.util.Stack;

public class StackInUse {
	public static void stackInUse() {
		Stack<String> deckOfCards = new Stack();
		String card1 = "Jack : Diamonds";
		String card2 = "8 : Hearts";
		String card3 = "3 : Clubs";
		deckOfCards.push(card1);
		deckOfCards.push(card2);
		deckOfCards.push(card3);
		System.out.println(deckOfCards);
		String top = deckOfCards.peek();
		System.out.println("The top is !" + top);
		System.out.println("The size of stack! " + deckOfCards.size());
		while (!deckOfCards.empty()) {
			String removeItems = deckOfCards.pop();
			System.out.println("This Item remove! " + removeItems);
		}
	}
}
