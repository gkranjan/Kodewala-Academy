package com.interfacePct.lambda4;

public class PaymentSystem {

	public static void main(String[] args) {

		Payment upi = (amount) ->
		{
			System.out.println("UPI Payment: Rs. "+amount);
			
		};
		Payment creditCard = (amount) -> {
			System.out.println("Credit Card Payment: Rs. "+amount);
		};
		
		Payment netBanking=(amount)-> 
		{
			System.out.println("NetBanking Payment: Rs. "+amount);
		};
		
		upi.pay(1500);
		creditCard.pay(2500);
		netBanking.pay(5000);
	}

}
