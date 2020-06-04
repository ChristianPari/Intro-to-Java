public class User {

	private String firstName;
	private String lastName;
	
	public String output() {
		
		return "Hi, my name is " + getFullName() + ".";
		
	}
	
	// FULL NAME - GET
	public String getFullName() {
		
		return getFirstName() + " " + getLastName();
		
	}
	
	// FIRST NAME - GET and SET
	public String getFirstName() { // GETTER
		
		return firstName;
		
	}
	
	public void setFirstName(String fn) { // SETTER
		
		firstName = fn.strip();
		
	}
	
	// LAST NAME - GET and SET
	public String getLastName() {
		
		return lastName;
		
	}
	
	public void setLastName(String ln) {
		
		lastName = ln;
		
	}
	
}
