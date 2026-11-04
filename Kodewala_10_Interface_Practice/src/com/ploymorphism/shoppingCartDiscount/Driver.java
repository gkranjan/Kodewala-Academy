package com.ploymorphism.shoppingCartDiscount;

/**
 * Shopping Cart Discount Engine
 * 
 * Problem: An e-commerce company provides different discounts depending on the customer category.

   Logic:
- Regular customer: 5%
- Premium customer: 10%
- VIP customer: 20%
- Purchase amount ₹1,000 se kam hai to koi discount nahi.
 * 
 * 
 * 
 */
class Customer {
    public double calculateDiscount(double amount) {
        return 0;
    }
}

class RegularCustomer extends Customer {
    @Override
    public double calculateDiscount(double amount) {
        return amount >= 1000 ? amount * 0.05 : 0;
    }
}

class PremiumCustomer extends Customer {
    @Override
    public double calculateDiscount(double amount) {
        return amount >= 1000 ? amount * 0.10 : 0;
    }
}

class VIPCustomer extends Customer {
    @Override
    public double calculateDiscount(double amount) {
        return amount >= 1000 ? amount * 0.20 : 0;
    }
}

public class Driver {
    public static void main(String[] args) {
        double amount = 5000;
        Customer customer = new RegularCustomer();

        System.out.println("Regular Final Bill: Rs. "
                + (amount - customer.calculateDiscount(amount)));

        customer = new PremiumCustomer();
        System.out.println("Premium Final Bill: Rs. "
                + (amount - customer.calculateDiscount(amount)));

        customer = new VIPCustomer();
        System.out.println("VIP Final Bill: Rs. "
                + (amount - customer.calculateDiscount(amount)));
    }
}




