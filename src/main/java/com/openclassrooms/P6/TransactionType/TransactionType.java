package com.openclassrooms.P6.TransactionType;

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
