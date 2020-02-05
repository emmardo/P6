package com.openclassrooms.P6.models;

public class BankAccountDetails {

    private int bankAccountDetailsIs;
    private int userId;
    private String iban;

    public int getBankAccountDetailsIs() {
        return bankAccountDetailsIs;
    }

    public void setBankAccountDetailsIs(int bankAccountDetailsIs) {
        this.bankAccountDetailsIs = bankAccountDetailsIs;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
