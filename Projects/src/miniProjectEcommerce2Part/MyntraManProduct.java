package miniProjectEcommerce2Part;

import java.util.Scanner;

public class MyntraManProduct  {
	
	void myntraManProductInput()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("i enter man product okk");
		
		System.out.println("How many product do you want to purchase:");
		int count=sc.nextInt();
		
		System.out.println("How much amount to purchase: ");
		int amount=sc.nextInt();
		
		System.out.println("Do you want to discount Y/N: ");
		String dis=sc.nextLine();
		
		sc.next();
		
		System.out.println("If you want to discount,your purchase amount above of 2000 !! OK/Not: ");
		String cond=sc.nextLine();
	
		double discount =sc.nextDouble();
		
//		public void discountedAmountDisplay(int amount,double discount)
//		{
//		switch (amount)
//		{
//		case 1:
//				
//			if (amount <=2000)
//			{
//			System.out.println("Discount applied 5%");
//			
//			double discount= amount *5 /100;
//			System.out.println("Discounted amount applied:"+discount);
//			break;
//			}
//			
//			else if
//			{
//			
//				System.out.println("Not applied:");
//			break;
//			}
//			
//		case 2:
//			if(amount<5000)
//				System.out.println("Discount applied 10% ");
//				double discount1=amount *10 /100;
//			System.out.println("Discounted  amount is:"+ discount1);
//			break;
//			
			
				
			
		}
		
		
		
	

}
