package com.kodewala.constructors7;

public class ElectronicProduct extends Product {
	int warrenty;
	
	public ElectronicProduct(String _name,int _price,String _product,int _warrenty)
	{
		super(_name,_price,_product);
		this.warrenty=_warrenty;
	}

}
