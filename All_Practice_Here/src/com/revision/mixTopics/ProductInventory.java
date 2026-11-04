package com.revision.mixTopics;

public class ProductInventory {

	static class Product
	{
		String name;
		int quantity;
		double price;
		
		public Product(String name, int quantity, double price) {
			super();
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		}
		
		double stockValue()
		{
			return quantity * price;
		}
		boolean lowStock()
		{
			return quantity < 5;
		}
	}
	
	public static void main(String[] args) {
		Product [] items = {
				new Product("Pen ",3,12.5),
				new Product("NoteBook ",12,45.0)
		};
		
		for(Product item : items)
		{
			System.out.println(item.name.toUpperCase()
					+" Value=" + item.stockValue()
					+" lowStock=" +item.lowStock());
		}
		}
	}
	

