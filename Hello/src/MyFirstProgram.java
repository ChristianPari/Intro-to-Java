import java.util.Scanner; // built-in package from Java, needed for user input; keeps conflicts from happening

public class MyFirstProgram { // classes have names, 'public' (access modifier) means can be accessed by other classes, methods in code
	
	public static void main(String[] args) { // method, (parameters are within the parentheses)

		// 9
		// Numeric expressions
		// if dividing integers, they are evaluated as whole numbers and results will be as such
		// to get decimals; ex. 5 / 2 => 2, but (double) 5 / 2 => 2.5; cast unary operator
		//^ works good for when dividing variables
		// Unary operators: an operator that only effects one operand; (double) 5 / 2 (only effects the integer 5)
		// Binary operators: an operator that effects more than one operand; 5 "+" 5
		
		// 10
		// new methods:
		// charAt(): returns index of character FIRST location
		// lastIndexOf(): returns the index of the last appearance of the data passed into the method(starts from the end of the string)
		// contains(): returns true if the string contains the passed in string or character anywhere in the string
		// strip(): removes all leading and trailing whitespace (including tabs, new lines)
		// repeat(x): repeats the specified string x amount of times
		// equals("string"): returns true or false is the passed "string" is the same as the string it's being compared to
		
		// 11
		// Created a new class called "User"; can be reused to make new User instances/objects
		// User has a property called "name"; data type String, to assign this property a value...
		User user1 = new User(); // created the new object
		user1.firstName = "Christian"; // access the name property and assigned a value/set the property
		user1.lastName = "Pari";
		String userFullName = user1.getFullName(); // use the class method to create the full name string and assign it to a variable
				
	}
	
}
