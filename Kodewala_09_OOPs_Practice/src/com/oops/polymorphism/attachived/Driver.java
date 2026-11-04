package com.oops.polymorphism.attachived;

public class Driver {

	public void userInput(String input) {
		/**
		 * first i create this type for calling user input output, i create second type
		 * for how it is works.only for demo.
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Which branch do you want to search:");
//		String input = sc.nextLine();

		BranchSearching search = new BranchSearching();
		// search.branchFilter(new Banka()); // this type also we call the method.

		if (input.equalsIgnoreCase("HDFCBank")) {
			search.branchFilter(new HDFCBank());
		} else if (input.equalsIgnoreCase("Bangalore")) {
			search.branchFilter(new Bangalore());
		} else if (input.equalsIgnoreCase("Delhi")) {
			search.branchFilter(new Delhi());
		} else if (input.equalsIgnoreCase("Banka")) {
			search.branchFilter(new Banka());
		} else if (input.equalsIgnoreCase("Jharkhand")) {
			search.branchFilter(new Jharkhand());
		} else if (input.equalsIgnoreCase("Mumbai")) {
			search.branchFilter(new Mumbai());
		} else if (input.equalsIgnoreCase("Patna")) {
			search.branchFilter(new Patna());
		} else {
			System.err.println("Branch not found! Try again!!!!");
		}

	}
}
