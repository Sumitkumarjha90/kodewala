package com.kodewala.junittest;

import com.kodewala.calculate.CalculateDiscount;
import com.kodewala.customer.Customer;

public class App {

    public static void main(String[] args) {

        Customer normal = new Customer("Normal", 1000);

        Customer premium = new Customer("Premium", 1000);

        CalculateDiscount discount = new CalculateDiscount();

        System.out.println("Normal Customer Final Amount : "
                + discount.calculate(normal));

        System.out.println("Premium Customer Final Amount : "
                + discount.calculate(premium));
    }
}