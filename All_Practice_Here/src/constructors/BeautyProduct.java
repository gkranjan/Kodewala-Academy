package constructors;

public class BeautyProduct extends Product {

	int expireMonths;
	
	public BeautyProduct(String _customerName,int _productID,String _productName,String _customerAddress,String _billingAddress,long _mobileNumber,int _expireMonths)
	{
		super(_customerName,_productID,_productName,_customerAddress,_billingAddress,_mobileNumber);
		this.expireMonths = _expireMonths;
	}
}
