package com.openclassrooms.P6.services;

import com.openclassrooms.P6.models.BankAccountDetail;
import com.openclassrooms.P6.models.User;
import com.openclassrooms.P6.repositories.BankAccountDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountDetailService {

    @Autowired
    private BankAccountDetailRepository bankAccountDetailRepository;

    public void createBankAccountDetail(User userId, String iban) {

        BankAccountDetail bankAccountDetail = new BankAccountDetail(userId, iban);

        bankAccountDetailRepository.save(bankAccountDetail);
    }

    public List<BankAccountDetail> getAllBankAccountDetails() {

        return bankAccountDetailRepository.findAll();
    }

    public List<BankAccountDetail> getAllBankAccountDetailsByUser(User userId) {

        return bankAccountDetailRepository.findAllByUserId(userId);
    }

    public BankAccountDetail getBankAccountDetailById(int id) {

        return bankAccountDetailRepository.findById(id).get();
    }

    public void updateBankAccountDetail(int id) {

        if()
    }
}
