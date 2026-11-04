package practiceProject;

public class UserDetails extends User {

	String product;
	String productDesc;

	UserDetails(String product, String productDesc) {
		super(product, productDesc);
		
		this.product = product;
		this.productDesc = productDesc;

	}

}
