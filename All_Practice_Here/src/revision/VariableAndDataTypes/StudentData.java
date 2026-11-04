package revision.VariableAndDataTypes;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Student Name:");
		String name=sc.nextLine();
		
		System.out.println("Total marks:");
		int marks=sc.nextInt();
		
		double percantage= marks*0.2;
		
		System.out.printf("%-10s : %s%n","Student Name",name);
		System.out.printf("Your Parcentage: %.2f%%%n",percantage);
		sc.close();
	}

}
