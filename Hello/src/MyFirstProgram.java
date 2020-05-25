import java.util.Scanner; // built-in package from Java, needed for user input; keeps conflicts from happening

public class MyFirstProgram { // classes have names, 'public' (access modifier) means can be accessed by other classes, methods in code
	
	// contents of this class are it's members
	// current members: method 'main', String 'x'
	// every Java program needs a 'public main method'
	
	public static void main(String[] args) { // method, (parameters are within the parentheses)
		// 'arguments' are what is passed into the method from a method call
		// can pass in arguments to this program via terminal
		// can access these arguments by accessing the arguments from this class (in parentheses)
		
//		System.out.println("Hello " + args[0]);
		//^ will only run in the terminal becuase that is where the argument was created
		//^ a dynamic program
		//^ not common!
		
		// class method
		// names can be different but 'main' is the runnable method
		// 'static' no instance needed
		// an 'object' is an instance of a class
		
		// 1-2
//		System.out.println("Hello world!");
		// statements are contained within the methods; tell the computer to do something
		// 'System' is a class
		// 'out' is a member of System
		// 'println' is a method
		
		// STRUCTURE TO CREATE A NEW OBJECT
		// type identifier = new type() () are the constructor of the class

		// 3-5
		// To get user input
//		System.out.println("What is your name?");
		
//		Scanner scanner = new Scanner(System.in);
		// without the import, would have to specify which type of Scanner is being used
		// ex: java.util.Scanner scanner = new java.util.Scanner(System.in) much more verbose and not needed thanks to imports
		// scanner is the variable name
		// 'System.in' comes from the console
//		String name = scanner.nextLine(); // assigns the variable 'name' a String value that is from the console
		
//		System.out.println("Hello " + name); // Outputs the concatenated string of "Hello" and the user inputed string
		
		// 6
		// Strings can be created without using the 'new' keyword
		// basic:
//		String basic = new String("This is a string");
		// easier:
//		String easier = "This is easier!"; A STRING LITERAL aka VALUE
		// combining literals, variables => become expression
		// expression evaluates to a value
		
		// 7
		// Java is statically typed: all types for data is needed up front
		// Data types: Primitive and Objects
		// Primitive: booleans, bytes, char, short, long, int, float, double
		// Object: instance of a class data type
		
//		int x = 5; // primitive
//		Integer y = 5; // object (5 is autoboxed)
		
		// 8
		// Scanner input
//		Scanner scanner = new Scanner(System.in);
//		String x = scanner.nextLine();
//		System.out.println(x);
		// the next thing scanned has to be a int or will throw an error
//		int y = scanner.nextInt();
//		System.out.println(y);
//		int a = y + 10;
//		System.out.println(a);
		
	}
	
	//	String x = new String(); // example of a property, store values
	
	// ERROR TYPES
	// compile errors - allows you to fix the error before it runs
	// runtime errors - able to run the program but crashes

}
