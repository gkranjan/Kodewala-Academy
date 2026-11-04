package this_super_constructor;

public class ThisAndSuperTogetherChild extends ThisAndSuperTogetherParent {

	int marks;

	ThisAndSuperTogetherChild() {
		this("Gautam", 90);
	}

	ThisAndSuperTogetherChild(String name, int marks) {
		super(name);
		this.marks = marks;
	}

	void display() {
		System.out.println("Name : " + name);
		System.out.println("Marks: " + marks);
	}

}
