package this_super_constructor;

 class SuperUseDetailsChild extends SuperUseDetails {
	
	String studentName;
	
	SuperUseDetailsChild(String _collegeName,String _studentName)
	{
		super(_collegeName);
		this.studentName=_studentName;
	
	}
		void display()
		{
			System.out.println("College: " +super.collegeName);
			System.out.println("Student: " +this.studentName);
		}
}
