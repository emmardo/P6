package com.openclassrooms.P6.services;

import com.openclassrooms.P6.models.Account;
import com.openclassrooms.P6.models.Connection;
import com.openclassrooms.P6.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void createUser(String email, String password) {

        User user = new User(email, password);

        Account account = new Account(0);

        Connection connection = new Connection(email);
    }
}
