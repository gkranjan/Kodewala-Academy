package practiceProject;

public class Switch {

	
	
		public void customerType(String discount, int amount) {
			//System.err.println("Enter the 3rd Class call !!!!");
			switch (discount) {
			case "Gold":
				if (amount >= 1000) {
					System.out.println("Discount applied 20% ");
				} else if (amount <= 1000) {
					System.err.println("In Gold no discount applied because you have less amount!!!");
				}

				break;

			case "Silver":
				if (amount >= 1000) {
					System.out.println("Discount applied 10% ");
				} else if (amount <= 1000) {
					System.err.println("In Silver no discount applied because you have less amount!!!");
				}
				break;

			case "Regular":
				if (amount >= 1000) {
					System.out.println("Discount applied 5% ");
				} else if (amount <= 1000) {
					System.err.println("In Regular no discount applied because you have less amount!!!");
				}
				break;

			default:
				System.err.println("Please enter correct input:");
			}

		}
	}



