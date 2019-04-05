package howToUseArray;

import java.util.LinkedList;

public class LInkedListUse {
	public static  void linkedListUse() {
		LinkedList<String> students = new LinkedList<>();
		students.add("Charlie");
		students.add("Sally");
		students.add("Morgan");
		students.add("Tylor");
		students.add("Jamie");
		students.addFirst("Sarah");
		students.addLast("Haily");
		students.add(2, "Tara");
		
		String firstStudent = students.getFirst();
		String lastStudent = students.getLast();
		System.out.println("First is : " + firstStudent);
		System.out.println("Last is : " + lastStudent);
		System.out.println("there are " + students.size() + " students");
		System.out.println(students);
		
		String secondStudent = students.get(1);
		System.out.println("The Second student is : " + secondStudent);
		int i = students.indexOf("Morgan");
		System.out.println("Index of Morgan : " + i);
		students.remove("Jamie");
		System.out.println(students);
		
		boolean hasTylor = students.contains("Tylor");
		System.out.println("Is tylor in the list : " + hasTylor);
	}
}
