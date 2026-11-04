package this_super_constructor;

public class ThisSuperConstructorChild extends ThisSuperConstructorParent {

	String name;
	int salary;

	ThisSuperConstructorChild() {
		this("Gautam", 60000);
	}

	ThisSuperConstructorChild(String name, int salary) {
		super("TCS");
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Company: " + super.company);
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
	}

}
