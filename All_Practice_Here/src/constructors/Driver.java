package constructors;

public class Driver {

	public static void main(String[] args) {
		
		ToysProduct obj = new ToysProduct("Gautam",01,"5 year baby bus.","Bihar","Bangalore",7014327652l,43);
		
				System.out.println("Toys Product Details:");
				System.out.println("");
				
				System.out.println("Customer Name: " +obj.customerName);
				System.out.println("Product ID: " +obj.productID);
				System.out.println("Product Name: " +obj.productName);
				System.out.println("Customer Address: " +obj.customerAddress);
				System.out.println("Billing Address: " +obj.billingAddress);
				System.out.println("Mobile Number: " +obj.mobileNumber);
				System.out.println("Return Validity Days: " +obj.returnValidity);
				System.out.println("");
			
					ElectronicProduct obj1 = new ElectronicProduct("Ranjan",02,"IPhone 18","Jharkhand","Delhi",7014327652l,5);
					
							System.out.println("Electronic Product Details: ");
							System.out.println("");
							
							System.out.println("Customer Name: " +obj1.customerName);
							System.out.println("Product ID: " +obj1.productID);
							System.out.println("Product Name: " +obj1.productName);
							System.out.println("Customer Address: " +obj1.customerAddress);
							System.out.println("Billing Address: " +obj1.billingAddress);
							System.out.println("Mobile Number: " +obj1.mobileNumber);
							System.out.println("Warrenty Months: " +obj1.warrentyMonths);
							System.out.println("");
					
			
							BeautyProduct obj2 = new BeautyProduct("Arti",03,"Eye Liner","Bihar","Jharkhand",7014327652l,5);
							
							
									System.out.println("Electronic Product Details: ");
									System.out.println("");
									
									System.out.println("Customer Name: " +obj2.customerName);
									System.out.println("Product ID: " +obj2.productID);
									System.out.println("Product Name: " +obj2.productName);
									System.out.println("Customer Address: " +obj2.customerAddress);
									System.out.println("Billing Address: " +obj2.billingAddress);
									System.out.println("Mobile Number: " +obj2.mobileNumber);
									System.out.println("Expiry Months: " +obj2.expireMonths);
									System.out.println("");
}
}