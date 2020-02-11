package com.openclassrooms.P6.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="bank_account_detail")
@EntityListeners(AuditingEntityListener.class)
public class BankAccountDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bankAccountDetailsId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User userId;

    @NotBlank
    private String iban;

    public int getBankAccountDetailsId() {
        return bankAccountDetailsId;
    }

    public void setBankAccountDetailsId(int bankAccountDetailsId) {
        this.bankAccountDetailsId = bankAccountDetailsId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
