package this_super_constructor;

public class AccessingParentVariable3 extends AccessingParentVariable2 {
	int age=20;

	AccessingParentVariable3()
	{
		super();
		
//		System.out.println("Child age (AccessingParentVariable3): " +this.age);
		System.out.println("Parent age (AccessingParentVariable2): " +super.age);
		System.out.println("Child age (AccessingParentVariable3): " +this.age);
// print statement changed then value also be the change.
	}
}
