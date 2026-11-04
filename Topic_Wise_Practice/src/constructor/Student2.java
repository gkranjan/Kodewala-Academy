
package constructor;

public class Student2 {

	String name;
	int marks;

	Student2(String name, int marks) {
		this.name = name;
		this.marks = marks;

	}

	void show() {

		System.out.println("Name:" + name + ", Marks:" + marks);
	}

}
