package com.kodewala.constructors7;

public class BeautyProduct extends Product{
	
	int expire;
	
	public BeautyProduct(String _name,int _price,String _product,int _expire)
	{
		super(_name,_price,_product);
		this.expire= _expire;
	}

}
