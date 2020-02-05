package com.openclassrooms.P6.models;

public class TransactionType {

    private int transactionTypeId;
    private enum typeOfTransaction {

        Incoming,
        Outgoing,
        TopUp,
        CashOut,
        Refund
    }
}
