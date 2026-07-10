package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Account;
import model.Customer;
import model.Transaction;

public class BankRepository {

    // Stores all customers
    private Map<Integer, Customer> customers = new HashMap<>();

    // Stores all accounts
    private Map<Long, Account> accounts = new HashMap<>();

    // Stores all transactions
    private List<Transaction> transactions = new ArrayList<>();
    
    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

}