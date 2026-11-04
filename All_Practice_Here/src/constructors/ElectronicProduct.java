package constructors;

public class ElectronicProduct extends Product {
	
	int warrentyMonths;

	public ElectronicProduct(String _customerName, int _productID, String _productName, String _customerAddress,
			String _billingAddress, long _mobileNumber,int _warrentyMonths) 
	
	{
		super(_customerName, _productID, _productName, _customerAddress, _billingAddress, _mobileNumber);
		this.warrentyMonths = _warrentyMonths;
		
	}
	
	
	
	

}
