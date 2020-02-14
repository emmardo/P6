package com.openclassrooms.P6.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="transaction_type")
@EntityListeners(AuditingEntityListener.class)
public class TransactionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionTypeId;

    @NotBlank
    private enum TypeOfTransaction {

        Incoming(1),
        Outgoing(2),
        TopUp(3),
        CashOut(4),
        Refund(5);

        private int type;

        TypeOfTransaction(int type) {
            this.type = type;
        }

        int getType() {

            return type;
        }
    }

    private TypeOfTransaction typeOfTransaction;

    public TransactionType() {
    }

    public TransactionType(TypeOfTransaction typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }


    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(int transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }
}
