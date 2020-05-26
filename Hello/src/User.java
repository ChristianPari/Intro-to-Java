// needed for practice, no real functionality
public class User {
	// members - methods and properties
	// creating a variable within a class is known as a property
	
	public String firstName; // created a "public" String variable and will set its value within the "main" class
	public String lastName;
	
	public String getFullName() { // a method for the User class to concat both name properties into a full name string
		return firstName + " " + lastName;
	}
	
}
