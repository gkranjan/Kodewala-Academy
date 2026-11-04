package practiceProject;

public class User {

	String name;
	String email;
	String mobile;

	User(String _name, String _email, String _mobile) {
		// this(300);
		this.name = _name;
		this.email = _email;
		this.mobile = _mobile;
	}

	User(String product, String productDesc) {
		System.out.println(product + " " + productDesc);
		System.out.println();
	}

	public void printDetails() {
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Mobile : " + mobile);
	}

	/*
	 * User(int amount) { System.out.println("Amount is:" +amount); }
	 * 
	 * User() { this("Ranjan"); System.out.println("Last name is: "); } User(String
	 * name) { //this("Ranjan");
	 * 
	 * System.out.println("Name is: " +name); }
	 */
}
