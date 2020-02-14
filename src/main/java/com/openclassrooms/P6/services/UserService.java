package com.openclassrooms.P6.services;

import com.openclassrooms.P6.models.Account;
import com.openclassrooms.P6.models.Connection;
import com.openclassrooms.P6.models.Role;
import com.openclassrooms.P6.models.User;
import com.openclassrooms.P6.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createAdminUser(String email, String password) {

        Role.Roles userRole = Role.Roles.Admin;

        Role role = new Role(1, userRole);

        User user = new User(email, password, role);

        Date date = new Date();

        user.setCreatedAt(date);
    }

    public List<User> getAllAdminUsers() {

        List<User> allUsersList = userRepository.findAll();

        List<User> adminUsersList = allUsersList.stream().filter(u -> u.getRoleId().getRoleId() == 1).collect(Collectors.toList());

        return adminUsersList;
    }

    public void deleteAdminUser(int id) {

        if(getUserById(id).getRoleId().getRoleId() == 1) {

            userRepository.deleteById(id);
        }
    }

    public void createRegularUser(String email, String password) {

        Role.Roles userRole = Role.Roles.User;

        Role role = new Role(2, userRole);

        User user = new User(email, password, role);

        Date date = new Date();

        user.setCreatedAt(date);

        Account account = new Account(user, 0);

        Connection connection = new Connection(user, email);
    }

    public List<User> getAllRegularUsers() {

        List<User> allUsersList = userRepository.findAll();

        List<User> regularUsersList = allUsersList.stream().filter(u -> u.getRoleId().getRoleId() == 2).collect(Collectors.toList());

        return regularUsersList;
    }

    public User getUserById(int id) {

        return userRepository.findById(id).get();
    }

    public User getUserByEmail(String email) {

        return userRepository.findByEmail(email);
    }

    public void updateUsersEmailAddress(String currentEmailAddress, String password, String newEmailAddress) {

        if(getUserByEmail(currentEmailAddress) != null && getUserByEmail(currentEmailAddress).getPassword().equals(password)) {

            User user = getUserByEmail(currentEmailAddress);
            user.setEmail(newEmailAddress);

            Date date = new Date();
            user.setUpdatedAt(date);
        }
    }

    public void updateUsersPassword(String emailAddress, String currentPassword, String newPassword) {

        if(getUserByEmail(emailAddress) != null && getUserByEmail(emailAddress).getPassword().equals(currentPassword)) {

            User user = getUserByEmail(emailAddress);
            user.setPassword(newPassword);

            Date date = new Date();
            user.setUpdatedAt(date);
        }
    }

    public void deleteRegularUser(int id) {

        if(getUserById(id).getRoleId().getRoleId() == 2) {

            userRepository.deleteById(id);
        }
    }
}
