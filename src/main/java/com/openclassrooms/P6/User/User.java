package com.openclassrooms.P6.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue
    private int userId;

    private String email;
    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password = password;
    }
}
