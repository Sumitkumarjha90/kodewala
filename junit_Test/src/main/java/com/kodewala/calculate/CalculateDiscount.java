package com.kodewala.calculate;

import com.kodewala.customer.Customer;

public class CalculateDiscount {

    public double calculate(Customer customer) {

        if (customer.getCustomerType().equalsIgnoreCase("Normal")) {

            return customer.getAmount() - (customer.getAmount() * 10 / 100);

        } else if (customer.getCustomerType().equalsIgnoreCase("Premium")) {

            return customer.getAmount() - (customer.getAmount() * 20 / 100);

        } else {

            return customer.getAmount();
        }
    }
}