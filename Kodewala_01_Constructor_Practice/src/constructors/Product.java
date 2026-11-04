package constructors;

public class Product {
	
	String customerName;
	int	   productID;
	String productName;
	String customerAddress;
	String billingAddress;
	long   mobileNumber;
	
	
	public Product(String _customerName,int	   _productID,String _productName,String _customerAddress,String _billingAddress,long    _mobileNumber)
	{
		this.customerName = _customerName;
		this.productID    = _productID;
		this.productName  = _productName;
		this.customerAddress= _customerAddress;
		this.billingAddress= _billingAddress;
		this.mobileNumber = _mobileNumber;
	}

}
