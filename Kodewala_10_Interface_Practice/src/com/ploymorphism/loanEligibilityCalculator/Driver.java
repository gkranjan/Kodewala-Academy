package com.ploymorphism.loanEligibilityCalculator;

/**
 * Loan Eligibility Calculator
 * 
 * Problem: A banking application checks the maximum eligible loan amount based on customer type and monthly salary.

   Logic:
- Salaried customer: 20 times monthly salary
- Self-employed customer: 15 times monthly salary
- Pensioner: 10 times monthly pension
- Monthly income below ₹20,000: not eligible.
 * 
 */

class Loan {
    public double calculateEligibleLoan(double income) {
        return 0;
    }
}

class SalariedLoan extends Loan {
    @Override
    public double calculateEligibleLoan(double income) {
        return income >= 20000 ? income * 20 : 0;
    }
}

class SelfEmployedLoan extends Loan {
    @Override
    public double calculateEligibleLoan(double income) {
        return income >= 20000 ? income * 15 : 0;
    }
}

class PensionerLoan extends Loan {
    @Override
    public double calculateEligibleLoan(double income) {
        return income >= 20000 ? income * 10 : 0;
    }
}

public class Driver {
    public static void main(String[] args) {
        double income = 30000;
        Loan loan = new SalariedLoan();

        System.out.println("Salaried Loan: Rs. "
                + loan.calculateEligibleLoan(income));

        loan = new SelfEmployedLoan();
        System.out.println("Self-Employed Loan: Rs. "
                + loan.calculateEligibleLoan(income));

        loan = new PensionerLoan();
        System.out.println("Pensioner Loan: Rs. "
                + loan.calculateEligibleLoan(income));

        income = 15000;
        loan = new SalariedLoan();
        System.out.println("Low Income Loan: Rs. "
                + loan.calculateEligibleLoan(income));
    }
}

