package com.kodewala.customer;

public class Customer {

    private String customerType;
    private double amount;

    public Customer(String customerType, double amount) {
        this.customerType = customerType;
        this.amount = amount;
    }

    public String getCustomerType() {
        return customerType;
    }

    public double getAmount() {
        return amount;
    }
}