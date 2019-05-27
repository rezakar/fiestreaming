package stringExplaination;

public class StringEquality {
	static String literal = "hello";
	static String obj = new String ("hello");
	static String otherLiteral = "hello";
	String[] r = {"tree","yree", "utree"};
	//literal --> "hello"
	//otherLiteral --> "hello"
	
	//obj --> "hello"
	public static void literalMethod() {
		System.out.println(literal == obj);
		System.out.println(literal == otherLiteral);
		System.out.println(literal.equals(obj));
		System.out.println(literal.equals(otherLiteral));
		String[] r = {"tree","yree","tree","yree", "utree"};
		
		}
public static String getUnique(String[] r) {
	int index=0;
	String unique="tree";
	for (int i = 0; i < r.length; i++) {
		if (r[i].equals(r[i]+1)){
		index++;
		}else unique = r[i];
		
	} 
	return unique;
		
	}
public static void main (String[] args) {
	String[] r = {"tree","yree","tree","yree", "utree"};
	System.out.println(getUnique(r));
	literalMethod();
}
	}
