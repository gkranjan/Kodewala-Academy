package loopsMultipleClass;

public class SBIBank {
	
	String customerName;
	int  balance;
	int mobile;
	
	public SBIBank(String _customerName, int _balance, int _mobile) {
		
		this.customerName = _customerName;
		this.balance = _balance;
		this.mobile = _mobile;
	}
	
	public void display()
	{
		System.out.println("Customer Name: "+customerName);
		System.out.println("Customer Balance: "+balance);
		System.out.println("Customer Mobile Number: " +mobile);
	}
	
	
	

}
