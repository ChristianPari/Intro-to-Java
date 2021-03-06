Contained within this repo is code that I wrote to learn, to grow and develope my knowledge of Java (which at this current momment is none). As I go through this step by step proccess I will make frequent commits that will explain the work I've done, and within this README I will document (for my own practice and for notes) what I have done in this project.<br>

<h2>June 3, 2020</h2>
7:30pm - 8:00pm<br>

Learned about the Java Encapsulation and the basics of how to use it:
- Used to hide/encapsulate data
- Mostly used with Class level variables, accessible throughout the whole class
    - Use Getter method to get data from the variable
    - Use Setter method to set new data within the variable
- Can change the inner mechanics of the encapsulated variable without changing anything in the interface
- Getter methods either RETURN data or are created as void
- Getter methods do not have parameters
- Setter methods do have parameters
- Setting value from outside the class: className.setFunction(data);
- Ensure to use the get methods within the class holding the private data types throughout the class methods to make sure that the correct data is being used throughout the class methods

<h2>May 31, 2020</h2>
3:00pm - 3:15pm<br>

Learned how to use the List Interface and create ArrayLists from this interface. Notes on this session below and found [here](https://github.com/ChristianPari/Intro-to-Java/commit/71ba462b90c7aafe6343fcaa7bc4fd700a627df1)<br>
- Anything used between "<>" is called a 'generic', a class that can work with various data types
- Create a list using the List<DataType> listName = new TypeList<DataType>(); a list can be editted via:
  - add, set, remove, clear
  - get is used to retireve a specific index from the list
- Use the Collections class to sort a list via:
   - sort or reverse

<h2>May 28, 2020</h2>
7:15am - 8:00am<br>

This session was going over the new methods within Java that I'm not familair with and understanding the syntax used to create Arrays, definitely feel that this way of creating arrays is more difficult but I'm sure with practice it will seems like second nature in time. The code for this session can be found [here](https://github.com/ChristianPari/Intro-to-Java/blob/master/Hello/src/MyFirstProgram.java).

- //how to create an array
- // (data type)[] arrayName = new (data type)[length of the array];
- // int[] grades = new int[10];
- //fill an array
- // arrayName[index] = value;
- // grades[0] = 10;
- //another way to create an array (shorthand)
- // (data type)[] arrayName = {value1, value2, ...};
- // int[] grades = {1, 6, 3, 8, 4, 8, 9, 5, 3};
- //dynamic way of filling an array via loops
- //how to print an array to the console
- // System.out.println(Arrays.toString(arrayName));
- //convert array to string via Arrays.toString();
- //how to print nested arrays
- // System.out.println(Arrays.deepToString(arrayName));
- //convert nested arrays to string via Arrays.deepToString();
- //how to compare arrays
- //Arrays.equals(array1, array2); returns boolean
- //how to comepare nested arrays
- //Array.deepEquals(array1, array2); returns boolean
- //Array.fill(arrayName, value);
- //This method fills an array with the value in every index

<h2>May 26, 2020</h2>
4:50am - 5:30am<br>

Spent time understanding numeric expressions since they're slightly different then what I'm used to with JavaScript, actually understand what 'casting' is and learned some new terminology: unary operator, binary operator. Learned some new String methods and [created my first dynamic class](https://github.com/ChristianPari/Intro-to-Java/blob/master/Hello/src/User.java) and added some properties and a method to it to understand their uses. Syntax is pretty straightfoward.<br>
Class notes, commit links ([Main Class](https://github.com/ChristianPari/Intro-to-Java/commit/0ac4fcca81b42977572f09c18a59bf074c2d7190), [Created User Class](https://github.com/ChristianPari/Intro-to-Java/commit/fa894b58cf908cb872e8577ca4d1a1f4a1f76e15)):
- // Numeric expressions
- // if dividing integers, they are evaluated as whole numbers and results will be as such
- // to get decimals; ex. 5 / 2 => 2, but (double) 5 / 2 => 2.5; cast unary operator
- //^ works good for when dividing variables
- // Unary operators: an operator that only effects one operand; (double) 5 / 2 (only effects the integer 5)
- // Binary operators: an operator that effects more than one operand; 5 "+" 5
- // new methods:
- // charAt(): returns index of character FIRST location
- // lastIndexOf(): returns the index of the last appearance of the data passed into the method(starts from the end of the string)
- // contains(): returns true if the string contains the passed in string or character anywhere in the string
- // strip(): removes all leading and trailing whitespace (including tabs, new lines)
- // repeat(x): repeats the specified string x amount of times
- // equals("string"): returns true or false is the passed "string" is the same as the string it's being compared to
- // Created a new class called "User"; can be reused to make new User instances/objects
- // User has a property called "name"; data type String, to assign this property a value...
- //User user1 = new User(); // created the new object for class User
- //user1.firstName = "Christian"; // access the name property and assigned a value/set the property
- //user1.lastName = "Pari";
- //String userFullName = user1.getFullName(); // use the class method to create the full name string and assign it to a variable

<h2>May 25, 2020</h2>
10:45am - 11:20am<br>

Practice work with different data types:
- Primtive: booleans, bytes, char, short, long, int, float, double
- Objects: instances of a class data type
Learned about type literals where the value is just expressed without the 'new' keyword. Also that Java is a staically typed language which means all types for the data being used needs to be declared first.<br>
Practice with user input via the Scanner class, assigning methods like nextLine() to a variable so that what gets inputed by the user is stored in a variable. Many different types of reading methods that Scanner allows us to use (for each primitive data type and more).<br>

Class notes, [commit link](https://github.com/ChristianPari/Intro-to-Java/commit/f067d5a9bbbfb08839d9371983890bd11c8df611):
- // To get user input
- //System.out.println("What is your name?");
- //Scanner scanner = new Scanner(System.in);
- // without the import, would have to specify which type of Scanner is being used
- // ex: java.util.Scanner scanner = new java.util.Scanner(System.in) much more verbose and not needed thanks to imports
- // scanner is the variable name
- // 'System.in' comes from the console
- //String name = scanner.nextLine(); // assigns the variable 'name' a String value that is from the console
- //System.out.println("Hello " + name); // Outputs the concatenated string of "Hello" and the user inputed string
- // Scanner input
- //Scanner scanner = new Scanner(System.in);
- //String x = scanner.nextLine();
- //System.out.println(x);
- // the next thing scanned has to be a int or will throw an error
- //int y = scanner.nextInt();
- //System.out.println(y);
- //int a = y + 10;
- //System.out.println(a);
- // Strings can be created without using the 'new' keyword
- // basic:
- //String basic = new String("This is a string");
- // easier:
- //String easier = "This is easier!"; A STRING LITERAL aka VALUE
- // combining literals, variables => become expression
- // expression evaluates to a value
- // Java is statically typed: all types for data is needed up front
- // Data types: Primitive and Objects
- // Primitive: booleans, bytes, char, short, long, int, float, double
- // Object: instance of a class data type
- //int x = 5; // primitive
- //Integer y = 5; // object (5 is autoboxed)

<h2>May 24, 2020</h2>
5:45pm - 6:45pm<br>

Spent lots of time understanding the basics and the syntaxing of Java. My code contains all of my notes but to sum up the brunt of the work done:<br>
- Classes: named, have an access modifier (declares the accessibility of the class), contents within them are their members
- Methods: declared within classes, every program MUST have a method named 'main'
- Parameters: placeholder names that are within the parentheses of a method
- Arguments: the actual value being passed into a function within it's parentheses
- Structure of an Object: Type identifier = new Type()
- import: used to import packages into the code > import java.XXXX.XXXX;
- Error types:
  - runtime errors: able to run the program but crashes
  - compile errors: allows you to fix the error before it runs
  
Class notes, [commit link](https://github.com/ChristianPari/Intro-to-Java/commit/43280a5b4c26a82ce55a8aac59c2073a02e54a6c):
- // every Java program needs a 'public main method'
- // 'arguments' are what is passed into the method from a method call
- // can access these arguments by accessing the arguments from this class (in parentheses)
- // System.out.println("Hello " + args[0]);
- //^ will only run in the terminal becuase that is where the argument was created
- //^ a dynamic program
- //^ not common!
- // names can be different but 'main' is the runnable method
- // 'static' no instance needed
- // an 'object' is an instance of a class
- // System.out.println("Hello world!");
- // statements are contained within the methods; tell the computer to do something
- // 'System' is a class
- // 'out' is a member of System
- // 'println' is a method
- // STRUCTURE TO CREATE A NEW OBJECT
- // type identifier = new type() () are the constructor of the class
- //	String x = new String(); // example of a property, store values
- // ERROR TYPES
- // compile errors - allows you to fix the error before it runs
- // runtime errors - able to run the program but crashes

<h2>May 24, 2020</h2><br>
11:00am - 11:15am<br>

Installed Eclipse IDE and Java JDK, once configured simply created a new project in Eclipse and then printed to the console "Hello World!".<br>
System.out: The `Output Stream`; appears in the console<br>
System.out.println(): used to print to the console<br>
