package model;

import enums.AccountStatus;
import enums.AccountType;

public class Account {

    private long accountNumber;
    private AccountType accountType;
    private double balance;
    private AccountStatus status;
    private Customer customer;

    // Default Constructor
    public Account() {

    }

    // Parameterized Constructor
    public Account(long accountNumber, AccountType accountType,
                   double balance, AccountStatus status,
                   Customer customer) {

        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.status = status;
        this.customer = customer;
    }

    // Getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    // Setters
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountType=" + accountType +
                ", balance=" + balance +
                ", status=" + status +
                ", customer=" + customer +
                '}';
    }
}