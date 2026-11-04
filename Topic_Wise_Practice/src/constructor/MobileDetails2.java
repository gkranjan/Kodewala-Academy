package constructor;

public class MobileDetails2 {
	
	String brand,model;
	double price;
	
	MobileDetails2 (String _brand,String _model,double _price)
		{
			this.brand=_brand;
			this.model=_model;
			this.price=_price;
		}
		
			void show()
			{
				System.out.println(brand+ " " +model+ " Rs " +price);
			}
}
