package howToUseArray;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUse {
	public static void queueUse() {
		Queue<String> queue = new LinkedList<>();
		//Enquue items
		queue.add("Sam");
		queue.add("Anna");
		queue.add("Heidi");
		queue.add("Susan");
		queue.add("Charlotte");
		System.out.println(queue);
		String nextInQueue = queue.peek();
		System.out.println("Next up! " + nextInQueue);
		String recentlyRemove = queue.remove();
		System.out.println("recently remove! " + recentlyRemove);
		System.out.println("The final Queue ! " + queue);
	}

}
