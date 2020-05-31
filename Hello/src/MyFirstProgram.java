import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.Scanner; // built-in package from Java, needed for user input; keeps conflicts from happening

public class MyFirstProgram { // classes have names, 'public' (access modifier) means can be accessed by other classes, methods in code
	
	public static void main(String[] args) { // method, (parameters are within the parentheses)

		//<Data Type> is a 'generic' : a class that can work with various types
		//How to create an array list
		// ArrayList<Integer> arrayName = new ArrayList<Integer>();
		//To add to the array list
		// arrayName.add(element);
		//To get a element from the array list
		// arrayName.get(idx);
		//To update an index
		// arrayName.set(idx, element);
		//To get array list length/size
		// arrayName.size();
		
		//List(Interface) is used to create any list(List Implementation)
		// List<Integer> listName = new ArrayList<Integer>();
		//To insert elements at certain indexes
		// listName.add(idx, element);
		//To remove an element
		// listname.remove(idx);
		//To delete all elements
		// listName.clear();
		
		//To create a List from an array
		// List<Integer> listName = Arrays.asList(4, 3, 2, 1);
		//To make the whole ListArray a string
		// Arrays.deepToString(listName.toArray());
		
		//To sort a list
		// Collections.sort(listName);
		//To reverse a list order
		// Collections.reverse(listName);
				
	}
	
}
