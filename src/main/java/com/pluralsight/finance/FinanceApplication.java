package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("Lucas' Account", "123456789", 100000);
        CreditCard creditCard = new CreditCard("Lucas' Quicksilver Card", "123456789", 999.99);
        Gold gold = new Gold("Gold Chain", 50000, 50);

        Portfolio portfolio = new Portfolio("Lucas' Assets", "Lucas");
        portfolio.add(checkingAccount);
        portfolio.add(creditCard);
        portfolio.add(gold);

        System.out.println(portfolio.getValue());


    }
}
