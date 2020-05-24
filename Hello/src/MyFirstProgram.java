public class MyFirstProgram { // classes have names, 'public' (access modifier) means can be accessed by other classes, methods in code
	// contents of this class are it's members
	// current members: method 'main', String 'x'
	// every Java program needs a 'public main method'
	public static void main(String[] args) { // method, (arguments are within the parentheses)
		// can pass in arguments to this program via terminal
		// can access these arguments by accessing the arguments from this class (in parentheses)
		//System.out.println("Hello " + args[0]);
		//^ will only run in the terminal becuase that is where the argument was created
		//^ a dynamic program
		//^ not common!
		// class method
		// names can be different but 'main' is the runnable method
		// 'static' no instance needed
		// an 'object' is an instance of a class
		// statements are contained within the methods; tell the computer to do something
		System.out.println("Hello world!"); 
		// 'System' is a class
		// 'out' is a member of System
		// 'println' is a method
	}
	
	//	String x = new String(); // example of a property, store values
	
	// ERROR TYPES
	// compile errors - allows you to fix the error before it runs
	// runtime errors - able to run the program but crashes
	

}
