package main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8ForEachExample {
	public static void streamingJava8() {
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));

	}
	public static void functionalInterfaceJava8() {
		//Using the test method of prodicate
		Predicate<String> stringLen = (s) -> s.length() < 10;
		System.out.println(stringLen.test("Apple") + " - Apple is less than 10");
		
		//Consumer example use accept method
		Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
		consumerStr.accept("ABCDmnvfgGFDRTmkloiAJSGF");
		
		//Function examle
		Function<Integer,String> converter = (num)-> Integer.toString(num);
		System.out.println("length of 26: " + converter.apply(456).length());
		
		//Supplier example
		Supplier<String> s = ()-> "Java is powefull";
		System.out.println(s.get());
		
		//Binary Operator
		BinaryOperator<Integer> add = (a, b)-> a+b;
		System.out.println("add 10 + 25: " + add.apply(10, 25));
		//Unary Operator
		UnaryOperator<String> str = (msg)-> msg.toUpperCase();
		System.out.println(str.apply("This is my message"));
	}
	public static void ThreadingLambdaJava8() {
		//Anonymous inner class: Runnable
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("run 1");
			}
		};
		//Lambda version of Runnable (no argument)
		Runnable r2 = () -> System.out.println("run2");
		
		//Start both threads
		r2.run();
		r.run();
		
		//Using an exesting functional BiFunction
		BiFunction<String, String, String> concat = (a, b) -> a + b;
		String sentence = concat.apply("Today is ", "a great day");
		System.out.println(sentence);
		
		//Example of the consumer functional interface
		Consumer<String> Hello = name -> System.out.println("Hello, " + name);
		for (String name: Arrays.asList("Duck", "Micky", "Minnie")) {
			Hello.accept(name);
		}
		//example of passing one value
			GreetingFunction greeting = message ->
			System.out.println("Java Progamming " + message);
			greeting.sayMessage("rock With lambda expressions");
		
	}
	@FunctionalInterface
	interface GreetingFunction {
		void sayMessage(String message);
	}
	@FunctionalInterface
	public interface Calculate {
		int calc(int x, int y);
		}
	
	//The methods as lambda
	public static void methodsAsLambda() {
		IntFunction<String> intToString = num -> Integer.toString(num);
		System.out.println("expected value 3, actual value: " + 
		intToString.apply(123).length());
		
		//static method refrencw ::
		IntFunction<String> intToString2 = Integer::toString;
		System.out.println("expected value 4, actual value: " + 
		intToString2.apply(4561).length());
		
		//lambda made using a condtractor
		Function<String, BigInteger> newBigInt = BigInteger::new;
		System.out.println("expected value: 123456789, actual value: " + 
		newBigInt.apply("123456789"));
		
		//example of a lambda made from an instance method
		Consumer<String> print = System.out::println;
		print.accept("Coming to you directly from a lambda...");
		
		UnaryOperator<String> makeGreeting = "Hello, "::concat;
		System.out.println(makeGreeting.apply("Reza"));
	}
	public static void createFunctionalInterfaceMannaly() {
		Calculate add = (a, b)-> a + b;
		Calculate difference = (a, b) -> Math.abs(a-b);
		Calculate divide = (a, b)-> (b != 0 ? a/b : 0);
		Calculate multiply = (c, d)-> c * d;
		
		System.out.println(add.calc(3, 2));
		System.out.println(difference.calc(5, 10));
		System.out.println(divide.calc(12, 3));
		System.out.println(multiply.calc(5, 3));
	}
	
	public static void main(String[] args) {
		/****************************Foreach Method in Iterable Interface***********************/ 
		/*//creating sample Collection
				List<Integer> myList = new ArrayList<Integer>();
				for(int i=0; i<10; i++) myList.add(i);
				
				//traversing using Iterator
				Iterator<Integer> it = myList.iterator();
				while(it.hasNext()){
					Integer i = it.next();
					System.out.println("Iterator Value::"+i);
				}
				
				//traversing through forEach method of Iterable with anonymous class
				myList.forEach(new Consumer<Integer>() {

					public void accept(Integer t) {
						System.out.println("forEach anonymous class Value::"+t);
					}

				});
				
				//traversing with Consumer interface implementation
				MyConsumer action = new MyConsumer();
				myList.forEach(action);
				
			}*/
	/****************************Foreach Method in Iterable Interface***********************/ 
	/****************************Streaming in java 8****************************************/
		//streamingJava8();
	/****************************Functional Interface****************************************/
		//functionalInterfaceJava8();
	/****************************Threading with functional interface in java 8****************************************/
		//ThreadingLambdaJava8();
	/****************************Functional Interface****************************************/
		//methodsAsLambda();
	/****************************create new functional interface****************************************/
		//createFunctionalInterfaceMannaly();
	/****************************create new functional interface****************************************/
		CollectionMapsStremInJava8.CollectionMapsStremInJava();
		
	}
}
//Consumer implementation that can be reused
	class MyConsumer implements Consumer<Integer>{

		public void accept(Integer t) {
			System.out.println("Consumer impl Value: "+t);
		}


}
	class CollectionMapsStremInJava8{
		public static void CollectionMapsStremInJava() {
			List<String> names = Arrays.asList("Paul", "Jane", "Michaela", "Sam");
	        //way to sort prior to Java 8 lambdas
	        Collections.sort(names, new Comparator<String>() {
	            @Override
	            public int compare(String a, String b) {
	                return b.compareTo(a);
	            }
	        });
	        
	        //first iteration with lambda
	        Collections.sort(names, (String a, String b) -> {
	        	return b.compareTo(a);
	        });
	      //now remove the types and allow the compile to infer the type
			Collections.sort(names,  (a, b)-> b.compareTo(a));
			
			//total page on your book
			Book book1 = new Book("Miss Peregrine's Home for Peculiar Children",
	                "Ranson", "Riggs", 382);
	        Book book2 = new Book("Harry Potter and The Sorcerers Stone",
	                "JK", "Rowling", 411);
	        Book book3 = new Book("The Cat in the Hat",
	                "Dr", "Seuss", 45);
	        //use .collect to aggregate value
	        List<Book> books = Arrays.asList(book1, book2, book3);
	        int total = books.stream().collect(Collectors.summingInt(Book::getPages));
	        System.out.println(total);
	        
	        //use .collect to get autor last name
	        List<String> autorNames = books.stream().map(Book::getAuthorLName)
	        		.collect(Collectors.toList());
	        System.out.println(autorNames);
	        
	        //crete a list with duplicate
	        List<Book> dupBook = Arrays.asList(book1, book2, book3, book3, book1);
	        System.out.println("the list befor removing duplicates: ");
	        System.out.println(dupBook.toString());
	        
	        //remove duplicate
	        Collection<Book> noDups = new HashSet<>(dupBook);
	        System.out.println("after removing duplivcate : ");
	        System.out.println(noDups.toString());
	        
	        //example of using set to elimenate dups and sort automatically
	        Set<Integer> numbers = new HashSet<>(Arrays.asList(4, 3, 3, 3, 2, 1, 1, 1));
	        System.out.println(numbers.toString());
		}
		
		
		
	}
	 class Book {
	    private String title;
	    private String authorFName;
	    private String authorLName;
	    private int pages;
	  
	    public Book(String title, String authorFName, String authorLName, 
	            int pages) {
	        this.title = title;
	        this.authorFName = authorFName;
	        this.authorLName = authorLName;
	        this.pages = pages;
	     
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthorFName() {
	        return authorFName;
	    }

	    public void setAuthorFName(String authorFName) {
	        this.authorFName = authorFName;
	    }

	    public String getAuthorLName() {
	        return authorLName;
	    }

	    public void setAuthorLName(String authorLName) {
	        this.authorLName = authorLName;
	    }

	    public int getPages() {
	        return pages;
	    }

	    public void setPages(int pages) {
	        this.pages = pages;
	    }
	    public String toString()
	    {
	        return getTitle()+" Written By: "+getAuthorFName()+" " +getAuthorLName()+"\n";
	    }
	}


	
