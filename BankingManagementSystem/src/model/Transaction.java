package model;

import enums.TransactionType;

public class Transaction {

    private int transactionId;
    private long accountNumber;
    private TransactionType transactionType;
    private double amount;
    private String dateAndTime;

    // Default Constructor
    public Transaction() {

    }

    // Parameterized Constructor
    public Transaction(int transactionId, long accountNumber,
                       TransactionType transactionType,
                       double amount, String dateAndTime) {

        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateAndTime = dateAndTime;
    }

    // Getters
    public int getTransactionId() {
        return transactionId;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    // Setters
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", accountNumber=" + accountNumber +
                ", transactionType=" + transactionType +
                ", amount=" + amount +
                ", dateAndTime='" + dateAndTime + '\'' +
                '}';
    }
}