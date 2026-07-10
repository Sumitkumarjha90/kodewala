package com.kodewala;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kodewala.calculate.CalculateDiscount;
import com.kodewala.customer.Customer;

public class CalculateDiscountTest {

    @Test
    public void testNormalCustomerDiscount() {

        Customer customer = new Customer("Normal", 1000);

        CalculateDiscount discount = new CalculateDiscount();

        double result = discount.calculate(customer);

        assertEquals(900.0, result);
    }

    @Test
    public void testPremiumCustomerDiscount() {

        Customer customer = new Customer("Premium", 1000);

        CalculateDiscount discount = new CalculateDiscount();

        double result = discount.calculate(customer);

        assertEquals(800.0, result);
    }

    @Test
    public void testUnknownCustomer() {

        Customer customer = new Customer("Guest", 1000);

        CalculateDiscount discount = new CalculateDiscount();

        double result = discount.calculate(customer);

        assertEquals(1000.0, result);
    }
}