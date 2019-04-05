package stringExplaination;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StringInUse {
	public static void stringInUseMethod() {
		String firstname = "reza";
		String lastname = "kar";
		System.out.println("normal concat with + : " + firstname + " " + lastname);
		String concatName = (firstname.concat(" ")).concat(lastname);
		System.out.println("concat with concat method : " + concatName);
		StringBuilder stringbuilder = new StringBuilder("ABC");
		stringbuilder.append("fgh");
		stringbuilder.append("ghi");
		stringbuilder.append("vcb");
		stringbuilder.append("mlo");
		stringbuilder.insert(9, "ALPHA");
		stringbuilder.delete(1, 3);
		String a = stringbuilder.toString();
		System.out.println(a);
	}

	public static void stringArray() {
		String p = "       Panda";
		String f = "fish ";
		String c = "cat";
		String h = "Horse    ";
		String nothing = " ";
		String[] strings = { p, f, h, c, nothing };
		for (String s : strings) {
			System.out.println(s);
			s = s.trim();
			System.out.println(s);
			if (!s.isEmpty()) {
				System.out.println("Not empty : " + s);
			}
			if (s.length() > 0) {
				System.out.println("More than 3: " + s);
			}
		}

	}

	public static void stringFunctions() {
		//A P P L E S
		//0 1 2 3 4 5
		String a ="Apples";
		String b ="Bananas";
		String o ="Oranges";
		String bp ="Banana Peels";
		String p ="Peers";
		String[] fruits = {a, b, o, bp, p};
		for (String f : fruits) {
			System.out.println(f);
			//getting a character at a specific index
			int index = 1;
			/*System.out.println(f.charAt(index));*/
			char[] charArray = f.toCharArray();
			System.out.println("Char at " + index + " : " 
					+ charArray[index]);
			System.out.println();
			int indexOfLetterE = f.indexOf('e');
			System.out.println(indexOfLetterE);
			f = f.toLowerCase();
			if (f.contains("app")) {
				System.out.println("contain app: " + f);
			}
			System.out.println("Substring 1 to 4 : " + f.substring(1, 4));
		}
		
	}
	public final static String reverseString(String s) {
		StringBuilder stringb = new StringBuilder();
		for (int i = s.length()-1; i>=0; i--) {
			stringb.append(s.charAt(i));
		}
		return stringb.toString();
	}
	public List<String> getDate(String[] s) throws ParseException{
		String d="tree";
		String f ="tree";
		String z ="tree";
		List<String> ret = new ArrayList<>();
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			
			for (int i = 0; i < s.length; i++) {
				d=s[i];
				Date date1=new SimpleDateFormat("yyyyMMdd").parse(d);
				f= dateFormat.format(d);
				ret.add(f);
				
			} 
			
	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ret;
	}
}
