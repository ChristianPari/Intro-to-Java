import java.util.Arrays; // needed to use arrays

//import java.util.Scanner; // built-in package from Java, needed for user input; keeps conflicts from happening

public class MyFirstProgram { // classes have names, 'public' (access modifier) means can be accessed by other classes, methods in code
	
	public static void main(String[] args) { // method, (parameters are within the parentheses)

		// how to create an array
		// (data type)[] arrayName = new (data type)[length of the array];
//		int[] grades = new int[10];
		// fill an array
		// arrayName[index] = value;
//		grades[0] = 10;
		
		// another way to create an array (shorthand)
		// (data type)[] arrayName = {value1, value2, ...};
//		int[] grades = {1, 6, 3, 8, 4, 8, 9, 5, 3};
		
		// dynamic way of filling an array via loops
		
		// how to print an array to the console
//		System.out.println(Arrays.toString(arrayName));
		// convert array to string via Arrays.toString();
		
		// how to print nested arrays
//		System.out.println(Arrays.deepToString(arrayName));
		// convert nested arrays to string via Arrays.deepToString();
		
		// how to compare arrays
		// Arrays.equals(array1, array2); returns boolean
		// how to comepare nested arrays
		// Array.deepEquals(array1, array2); returns boolean
		
		// Array.fill(arrayName, value);
		// This method fills an array with the value in every index
				
	}
	
}
