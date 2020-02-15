package com.openclassrooms.P6.services;

import com.openclassrooms.P6.models.Account;
import com.openclassrooms.P6.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {

        return accountRepository.findAll();
    }

    public Account getAccountById(int id) {

        return accountRepository.findById(id).get();
    }

    public void changeToCurrentBalance(int id, float variation) {

        if(((accountRepository.findById(id).get().getCurrentBalance() + (variation)) > 0.00)) {

            float result = (accountRepository.findById(id).get().getCurrentBalance() + (variation));

            accountRepository.findById(id).get().setCurrentBalance(result);
        }
    }

    public void topUpCurrentBalance(int id, float topUpAmmount) {

        float balanceAfterTopUp = (accountRepository.findById(id).get().getCurrentBalance() + (topUpAmmount));

        accountRepository.findById(id).get().setCurrentBalance(balanceAfterTopUp);
    }
}
