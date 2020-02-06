package com.openclassrooms.P6.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="TransactionType")
@EntityListeners(AuditingEntityListener.class)
public class TransactionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionTypeId;

    @NotBlank
    private enum typeOfTransaction {

        Incoming,
        Outgoing,
        TopUp,
        CashOut,
        Refund
    }
}
