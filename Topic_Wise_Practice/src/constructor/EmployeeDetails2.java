package constructor;

public class EmployeeDetails2 {

	int id;
	String name;
	double salary;

	EmployeeDetails2(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	void show() {
		System.out.println(id + " " + name + " " + salary);

	}

}
