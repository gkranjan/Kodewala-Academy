package constructors;

public class ToysProduct extends Product{
	
	int returnValidity;
	
	public ToysProduct(String _customerName,int	   _productID,String _productName,String _customerAddress,String _billingAddress,long    _mobileNumber,int _returnValidity)
	{
		super(_customerName,_productID,_productName,_customerAddress,_billingAddress,_mobileNumber);
		this.returnValidity = _returnValidity;
	}

}
