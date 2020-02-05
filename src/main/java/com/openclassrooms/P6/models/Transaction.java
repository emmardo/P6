package com.openclassrooms.P6.models;

import java.sql.Timestamp;

public class Transaction {

    private int transactionId;
    private int accountId;
    private int userId;
    private int connectionId;
    private int transactionTypeId;
    private Timestamp timestamp;
    private float moneyAmountVariation;
    private float balanceBeforeTransaction;
    private String description;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(int connectionId) {
        this.connectionId = connectionId;
    }

    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(int transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public float getMoneyAmountVariation() {
        return moneyAmountVariation;
    }

    public void setMoneyAmountVariation(float moneyAmountVariation) {
        this.moneyAmountVariation = moneyAmountVariation;
    }

    public float getBalanceBeforeTransaction() {
        return balanceBeforeTransaction;
    }

    public void setBalanceBeforeTransaction(float balanceBeforeTransaction) {
        this.balanceBeforeTransaction = balanceBeforeTransaction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
