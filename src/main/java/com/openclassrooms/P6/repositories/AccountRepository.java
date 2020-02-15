package com.openclassrooms.P6.repositories;

import com.openclassrooms.P6.models.Account;
import com.openclassrooms.P6.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    void deleteByUserId(User userId);
}
