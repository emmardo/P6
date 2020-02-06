package com.openclassrooms.P6.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="BankAccountDetail")
@EntityListeners(AuditingEntityListener.class)
public class BankAccountDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bankAccountDetailsId;

    private int userId;

    @NotBlank
    private String iban;

    public int getBankAccountDetailsId() {
        return bankAccountDetailsId;
    }

    public void setBankAccountDetailsId(int bankAccountDetailsId) {
        this.bankAccountDetailsId = bankAccountDetailsId;
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
