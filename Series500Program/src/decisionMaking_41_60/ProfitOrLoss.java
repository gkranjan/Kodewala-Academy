package decisionMaking_41_60;

public class ProfitOrLoss {

	public static void main(String[] args) {

		double cp=1800,sp=950;
		if(sp>cp)
		{
			System.out.println("Profit=" +(sp-cp));
		}
		else if(sp<cp)
		{
			System.out.println("Loss="+(cp-sp));
		}
		else
		{
			System.out.println("No profit no loss");
		}
	}

}
