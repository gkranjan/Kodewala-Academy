package decisionMaking_41_60;

public class SeasonByMonth {

	public static void main(String[] args) {

		 int m = 12;
	        String s;

	        switch (m) {
	            case 12:
	            case 1:
	            case 2:
	                s = "Winter";
	                break;

	            case 3:
	            case 4:
	            case 5:
	                s = "Summer";
	                break;

	            case 6:
	            case 7:
	            case 8:
	            case 9:
	                s = "Monsoon";
	                break;

	            case 10:
	            case 11:
	                s = "Autumn";
	                break;

	            default:
	                s = "Invalid Month";
	        }

		System.out.println(s);
	
	}

}
