package this_super_constructor;

public class ReferringCurrentVariable {

	int id;
	String name;

	ReferringCurrentVariable(int id, String name) {
		this.id = id;
		this.name = name;

	}

	void display() {
		System.out.println("ID: " + id);
		System.out.println("name: " + name);
	}

}
