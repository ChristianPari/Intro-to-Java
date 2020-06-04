public class MyFirstProgram { // classes have names, 'public' (access modifier) means can be accessed by other classes, methods in code
	
	public static void main(String[] args) { // method, (parameters are within the parentheses)

		User user = new User();
		user.setFirstName("Chris");
		user.setLastName("Jones");
		
		String message = user.output();
		
		System.out.println(message);
		
	}
	
}
