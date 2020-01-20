package com.openclassrooms.P6.Account;

public class Account {

    private int accountId;
    private int userId;
    private float currentBalance;



    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        accountId = accountId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public float getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(float currentBalance) {
        currentBalance = currentBalance;
    }
}
